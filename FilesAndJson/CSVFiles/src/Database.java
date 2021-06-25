public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents) {
        String[] lines = contents.split("\\n");
        this.colNames = lines[0].split(",");
        this.data = new String[lines.length - 1][this.colNames.length];
        for (int i = 1; i < lines.length; i++) {
            this.data[i - 1] = lines[i].split(",");
        }
        this.numRows = lines.length - 1;
    }
    public String getValue(String columnName,int row){
        int col=0;
        for(col=0; col<this.colNames.length && !(this.colNames[col].equals(columnName)); col++);
        return this.data[row][col];
    }

}



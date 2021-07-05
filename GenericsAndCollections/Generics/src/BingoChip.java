public class BingoChip <C,R> {
    private C column;
    private R row;

    public BingoChip(C col, R row){
        this.column=col;
        this.row=row;

    }
    public String toString() {
        return "Chip: " + column.toString() + " " + row.toString();
    }
    }

/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/


import java.io.*;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("./resources/iris.data");
    }

    public Database readCSV(String filename) {
        String contents = "";
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))){
            byte[] buffer = new byte[1024];
            int lengthRead;
            /* TODO 
Create a while loop to read the contents of the file and put them in the variable "contents" declared at the beginning of the method. */
            while ((lengthRead = in.read(buffer)) >0) {
                contents = contents + new String(buffer, 0, lengthRead);
            }

        } catch (IOException e/* TODO
Put the correct Exception here. */) {
            e.printStackTrace();
            System.exit(-1);
        }
        return new Database(contents/* TODO
Return a Databse object initialized with the contents read. */);
    }
}


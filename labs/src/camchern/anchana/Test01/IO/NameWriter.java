package camchern.anchana.Test01.IO;

import java.io.IOException;
import java.io.PrintWriter;

public class NameWriter {
    public static void main(String[] args) throws IOException {
        try{
            String filename = args[0];
            PrintWriter printWriter = new PrintWriter(filename);
            printWriter.println("Hello");
            printWriter.close();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Provide  file name in the program argument");
        }catch (IOException ex) {
            System.err.println("Error in writing file");
            ex.printStackTrace(System.err);
        }
    }
}

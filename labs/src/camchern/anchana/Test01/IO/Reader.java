package camchern.anchana.Test01.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args)  {
        try {
            String filename = args[0];
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Provide  file name in the program argument");
        }
        catch (IOException ex) {
            System.err.println("Error in writing file");
            ex.printStackTrace(System.err);
        }
    }
}

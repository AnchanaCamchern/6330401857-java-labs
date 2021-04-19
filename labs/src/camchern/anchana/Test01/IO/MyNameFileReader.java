package camchern.anchana.Test01.IO;

import java.io.*;

public class MyNameFileReader {

    public static void main(String[] args) {
        String filename = "manee.txt";
        String line;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Error in reading file");
        }
    }
}

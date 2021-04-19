package camchern.anchana.Test01.IO;

import java.io.*;
public class MyNameFileWriter {
    public static void main(String[] args) {
        String filename = "manee.txt";
        try {
            FileWriter fw = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("มานี ดีใจ");
            pw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error in writing file");
        }
    }
}
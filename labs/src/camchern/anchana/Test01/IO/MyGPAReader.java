package camchern.anchana.Test01.IO;

import java.io.*;
public class MyGPAReader {
    public static void main(String[] args) {
        String filename = "gpa";
        try {
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dis = new DataInputStream(fis);
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println(name + " has gpa as " + gpa);
            fis.close();
            dis.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}

package camchern.anchana.Test01.IO;

import java.io.*;

public class MyGPAWriter {
    public static void main(String[] args) {
        String filename = "gpa";
        try {
            FileOutputStream fileOutput = new FileOutputStream(filename);
            DataOutputStream dataOutput = new DataOutputStream(fileOutput);
            dataOutput.writeUTF("Manee");
            dataOutput.writeDouble(3.8);
            fileOutput.close();
            dataOutput.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
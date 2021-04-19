package camchern.anchana.Test01.IO;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class ReadFile {
    public static void main(String[] args) throws IOException {
        try{
            String filename = "Books.txt";
            System.out.println("Start to read file " + filename);
            FileOutputStream fileOutputStream = new FileOutputStream(filename,true);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            Map<String, Double>books = new HashMap<String, Double>();
            books.put("NurtureShock: New Thinking About Children",14.99);
            books.put("Hello How R U", 15.89);
            for (String name : books.keySet()) {
                Double price = books.get(name);
                dataOutputStream.writeUTF(name);
                dataOutputStream.writeDouble(price);
            }
            fileOutputStream.close();
            dataOutputStream.close();
            System.out.println("Finish writing to file" + filename);
        }catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

}

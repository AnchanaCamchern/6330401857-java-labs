package camchern.anchana.Test01.IO;

import java.io.*;
public class StudentReader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student student = (Student) ois.readObject();
            System.out.println(student.getName() + " who has gpa as " +
                    student.getGpa());
        } catch (IOException ex) {
            System.err.println("Problem about reading file");
        } catch (ClassNotFoundException ex) {
            System.err.println("Problem about class Student");
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }
}
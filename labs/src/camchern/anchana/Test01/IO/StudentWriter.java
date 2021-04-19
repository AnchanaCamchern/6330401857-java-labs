package camchern.anchana.Test01.IO;

import java.io.*;

class Student implements Serializable {
    private String name;
    private double gpa;
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }
}
public class StudentWriter {
    public static void main(String[] args) {
        Student student = new Student("Manee", 3.8);
        try {
            FileOutputStream fos = new FileOutputStream("student");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.writeUTF("Java IO");
            oos.writeInt(88);
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
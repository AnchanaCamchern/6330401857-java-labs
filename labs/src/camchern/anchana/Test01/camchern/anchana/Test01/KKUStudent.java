package camchern.anchana.Test01;

public class KKUStudent  {
    protected String name;
    protected double gpa;
    final static String UNIVERSITY ="Khon Kaen University";

    KKUStudent(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    KKUStudent(String name) {
        this.name = name;
        this.gpa = 2.0;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static String getUNIVERSITY() {
        return UNIVERSITY;
    }

    @Override
    public String toString() {
        return "My name is " + getName() + "and my current GPA is " + getGpa();
    }
}

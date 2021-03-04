package camchern.anchana.OOP;

import java.util.Comparator;

class DmeEnStudent extends Student {
    public DmeEnStudent(String name) {
        this.name = name;
    }
    public DmeEnStudent(String name, String favoriteCourse) {
        this(name);
        this.favoriteCourse = favoriteCourse;
    }

    @Override
    public void writeProgram() {
        System.out.println(name + " writes programs in Python and C#");
    }

}

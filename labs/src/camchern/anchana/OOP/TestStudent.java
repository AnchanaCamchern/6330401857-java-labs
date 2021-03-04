package camchern.anchana.OOP;

import java.util.ArrayList;
import java.util.Collections;

class TestStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new DmeEnStudent("Manee",
                "Web Application Development"));
        students.add(new ComEnStudent("Mana",
                "Mobile Application Development"));
        students.add(new ComEnStudent("Piti",
                "Advanced Computer Programming"));


        for (Student student: students) {
            System.out.println(student);
        }

        Collections.sort(students, new CompareByCourse());


        System.out.println("\nAfter sorting by favorite courses");
        for (Student student: students) {
            System.out.println(student);
        }
    }
}

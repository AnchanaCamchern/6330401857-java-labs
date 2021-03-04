package camchern.anchana.OOP;

import java.util.Comparator;

class CompareByCourse implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getFavoriteCourse().compareTo(s2.getFavoriteCourse());

    }
}

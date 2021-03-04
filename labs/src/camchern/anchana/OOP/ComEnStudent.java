package camchern.anchana.OOP;

class ComEnStudent extends Student {
    public ComEnStudent(String name) {
        this.name = name;
    }
    public ComEnStudent(String name, String favoriteCourse) {
        this(name);
        this.favoriteCourse = favoriteCourse;
    }

    @Override
    public void writeProgram() {
        System.out.println(name + " writes programs in Python and Java");
    }
}

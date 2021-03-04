package camchern.anchana.OOP;

public abstract class Student {
    protected String name;
    protected String favoriteCourse;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void writeProgram();

    public int learnSpeed() {
        return 5;
    }
    public String getFavoriteCourse() {
        return favoriteCourse;
    }

    public void setFavoriteCourse(String favoriteCourse) {
        this.favoriteCourse = favoriteCourse;
    }
}

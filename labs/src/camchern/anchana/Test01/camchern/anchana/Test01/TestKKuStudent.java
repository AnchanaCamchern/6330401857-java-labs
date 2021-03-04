package camchern.anchana.Test01;

public class TestKKuStudent {
    public static void main(String[] args) {
        KKUStudent manee = new KKUStudent("Manee",3.2);
        KKUStudent chujai = new KKUStudent("Chujai");
        System.out.println(manee);
        System.out.println(chujai);
        System.out.println("They study at " + KKUStudent.getUNIVERSITY());
        compareGpa(manee, chujai);
        chujai.setGpa((3.4));
        System.out.println("Chujai has a studies hard and her GPA becomes " + chujai.getGpa());
        compareGpa(manee, chujai);
    }

    private static void compareGpa(KKUStudent s1, KKUStudent s2) {
        if(s1.getGpa() > s2.getGpa()) {
            System.out.println(s1.getName() + "has GPA greater than " + s2.getName());
        }else {
            System.out.println(s2.getName() + "has GPA greater than " + s1.getName());
        }
    }
}

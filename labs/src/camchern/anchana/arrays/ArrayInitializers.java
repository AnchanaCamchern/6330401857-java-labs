package anchana.arrays;

public class ArrayInitializers {
    static int [] myPhone = {0, 6, 5, 8, 5, 0, 3, 2, 9 ,1};
    public static void main(String[] args) {
        for (int i = 0; i < myPhone.length; i++) {
            System.out.print(myPhone[i] + "");
        }
    }
}

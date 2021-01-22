
public class aaa {
    public  static  void main(String[] args) {
        int[] list = {3, 3, 3, 3, 1, 1,};
        int[] list2 = {4, 4, 4, 2, 3, 2};
        double avg = 0;
        for (int i = 0; i < list.length; i++) {
            double GPA = list[i] * list2[i];
            System.out.println("GPA = " + GPA);
        }
    }
}

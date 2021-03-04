public class GroupDividerMethod {
    static int m;
    static int n;

    public static void main(String[] args) {
        getNumbers(args);
        dividerNumbers();
    }

    private static void getNumbers(String[] args) {
        if(args.length == 2){
            m = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);


            if(m < n) {
                System.err.println("Cannot diveGroupDivider a number by a larger number.");
                System.exit(0);
            } else {
                System.err.println("User : java GroupDivider <m> <n>");
            }
        }
    }

    private static void dividerNumbers() {

            for(int i = m ; i > 0 ; i--) {
                if (i % n == 0) {
                    System.out.println(i);
                }
            }
    }
}

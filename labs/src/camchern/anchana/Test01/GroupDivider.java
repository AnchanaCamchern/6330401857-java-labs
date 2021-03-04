public class GroupDivider {
    public static void main(String[] args) {
        if (args.length == 2){
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            if(m<n){
                System.err.println("Cannot diveGroupDivider a number by a larger number.");
                System.exit(0);
            }
            for(int i = m ; i > 0 ; i--){
                if (i%n == 0){
                    System.out.println(i);
                }
            }
        }else{
            System.err.println("User : java GroupDivider <m> <n>");
        }
    }
}
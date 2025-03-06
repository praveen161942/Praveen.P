import java.util.*;
public class DigitPattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int increase=1;increase<=row;increase++){
                System.out.print(increase);
            }
            for(int decrease=row-1;decrease>=1;decrease--){
                System.out.print(decrease);
            }

            System.out.println();
        }
    }
}

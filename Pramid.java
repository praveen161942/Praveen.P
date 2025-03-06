
import java.util.Scanner;

public class Pramid {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int row=0;row<n;row++){
            for(int space=0;space<=n-row+1;space++)
                System.out.print(" ");
            for(int col=0;col<=row;col++)
                System.out.print(" *");
            System.out.println();
        }
    }
}

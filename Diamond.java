
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int row=0;row<n*2;row++){
            int totCols= row>n ? 2*n-row : row;
            int space=n-totCols;
            for(int sp=0;sp<space;sp++){
                System.out.print(" ");
            }
            for(int col=0;col<totCols;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

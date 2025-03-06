import java.util.Scanner;

public class Hollow {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row==0 || row==n-1 || col==0 || col==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
                
        }

    }
}

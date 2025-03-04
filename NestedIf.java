
import java.util.Scanner;

class NestedIf{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        if(m>35){
            if(m>80){
                if(m==100){
                    System.out.println("Centum");
                    
                }
                else{
                    System.out.println("Great work");
                }
            }
            else{
                System.out.println("Good");
            }
        }
        else{
            System.out.println("Not good");
        }
    }

} 
import java.util.*;
class count0{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        while (n>0) {
            int rem=n%10;
            if(rem==0)
                count++;
            n/=10;
        }
        System.out.println(count);
    }
}
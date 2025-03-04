import java.util.*;
public class Vowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char c=scan.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='0'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("Vowels");
        }
        else{
            System.out.println("Consonents");
        }
    }
}

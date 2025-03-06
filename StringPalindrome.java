import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        System.out.println(palindrome(s,0,s.length()-1));
    }
    static boolean palindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start=start+1;
            end=end-1;
        }
        
        return true;
    }
    
}

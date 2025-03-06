
import java.util.Scanner;

public class FindLongestInString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String arr[]=str.split(" ");
        int max=0;
        String longest="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>max){
                max=arr[i].length();
                longest=arr[i];
            }
        }
        System.out.println(longest);
        System.out.println(max);
    }
}

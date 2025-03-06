import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) && !list.contains(str.charAt(i))){
                    list.add(str.charAt(i));
                }
            }
        }
        System.out.println(list);
    }
}

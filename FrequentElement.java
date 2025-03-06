import java.util.Scanner;

public class FrequentElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(repeatingElement(arr));
    }
    static int repeatingElement(int arr[]){
        int count=0,newCount=0,ele=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>newCount){
                    newCount=count;
                    ele=arr[i];
                }
            }
        }
        return ele;
    
    }
}

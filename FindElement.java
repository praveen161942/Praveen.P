import  java.util.*;
public class FindElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int target=scan.nextInt();
        System.out.println(findIndex(arr,target));
    }
    static int findIndex(int arr[],int target){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        return index;
    }
}

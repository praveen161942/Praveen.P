import java.util.*;
class SaddlePoint{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // int n=scan.nextInt();
        // int m=scan.nextInt();
        // int arr[][]=new int[n][m];
        // for(int row=0;row<n;row++){
        //     for(int col=0;col<m;col++){
        //         arr[row][col]=scan.nextInt();
        //     }
        // }
        int arr[][]={
            {4,3,8},
            {7,9,1},
            {8,4,7}
        };
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        ArrayList<Integer>Minlist=new ArrayList<>();
        ArrayList<Integer>Maxlist=new ArrayList<>();
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
                if(arr[row][col]>max){
                    max=arr[row][col];
                }

            }
            Minlist.add(min);
            Maxlist.add(max);
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
        }
        System.out.println(Minlist);
        System.out.println(Maxlist);
    }
}
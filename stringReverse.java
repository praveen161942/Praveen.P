public class stringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        char arr[]=new char[str.length()];
        arr=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}

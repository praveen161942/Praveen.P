class A{
    void printing1(){
        System.out.println("From class A");
    }
    void printing2(){
        System.out.println("From class A");
    }
    void printing3(){
        System.out.println("From class A");
    }

}

public class classObj {
    public static void main(String[] args) {
        A obj=new A();
        obj.printing1();
        obj.printing2();
        obj.printing3();
    }
    
}

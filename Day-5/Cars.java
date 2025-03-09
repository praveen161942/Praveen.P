class engine{
    void display(){
        System.out.println("5000cc engine");
    }
}

public class Cars {
    public static void main(String[] args) {
        engine audi=new engine();
        audi.display();
        engine benz=new engine();
        benz.display();
    }
}

import java.util.Scanner;
class Details{
    Details(int id,String name,double salary,int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary:"+salary);
        System.out.println("Age:"+age);
        
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int id=scan.nextInt();
        String name=scan.next();
        Double salary=scan.nextDouble();
        int age=scan.nextInt();
        Details obj=new Details(id,name,salary,age);
    }
}

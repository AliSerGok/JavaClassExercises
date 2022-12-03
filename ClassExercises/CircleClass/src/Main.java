import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter x");
        double x=input.nextDouble();
        System.out.println("enter y");
        double y=input.nextDouble();
        System.out.println("enter radius");
        double r= input.nextDouble();
        System.out.println("enter color");
        String col=input.next();

        Circle mac=new Circle(r,x,y,col);
        System.out.println(mac.printInfo());
    }


}





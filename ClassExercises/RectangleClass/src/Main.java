import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1=new Rectangle();
        rec1.printInfo();
        Scanner input=new Scanner(System.in);
        double width=input.nextDouble();
        double height=input.nextDouble();


        System.out.println();
        Rectangle rec2=new Rectangle(width,height);
        rec2.printInfo();

        width=4;
        height=40;
        System.out.println();
        Rectangle rec3=new Rectangle(width,height);
        rec3.printInfo();

        width=3.5;
        height=35.9;
        System.out.println();
        Rectangle rec4=new Rectangle(width,height);
        rec4.printInfo();

    }
}
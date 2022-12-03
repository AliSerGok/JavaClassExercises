import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int num=input.nextInt();


        MyInteger number=new MyInteger(num);
        number.printInfo();


    }
}
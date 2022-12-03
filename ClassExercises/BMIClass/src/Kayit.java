import java.util.Scanner;

public class Kayit {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        String name1=input.next();
        int age1= input.nextInt();;
        double weight1=input.nextDouble();
        double feet1=input.nextDouble();
        double inches1=input.nextDouble();

        BMI records = new BMI(name1,age1,weight1,feet1,inches1);
        System.out.println(records.recording());





    }
}

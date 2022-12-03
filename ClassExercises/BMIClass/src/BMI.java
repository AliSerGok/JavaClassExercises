public class BMI {

   String name;
   int age;
   double weight;
   double feet;
   double inches;



    public BMI(String name, int age, double weight, double feet, double inches){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.feet=feet;
        this.inches=inches;

    }
    public String recording(){
        return "Your information's are recorded\n"+this.name+"\n"+this.age+"\n"+this.weight+"\n"+this.feet+"\n"+this.inches;
    }
}

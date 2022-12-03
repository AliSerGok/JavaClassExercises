public class Circle {
    public double radius;
    public double x;
    public double y;
    public String color;
    public double pi=3.14;

    Circle(double radius, double x, double y, String color){
        this.radius=radius;
        this.x=x;
        this.y=y;
        this.color=color;
        System.out.println("This is a Circle object");

    }

    public double computeArea(){
        return pi*radius*radius;
    }

    public double computePerimeter(){
        return 2*pi*radius;
    }

    public String printInfo(){
     return    "Circle Area:       "+computeArea()+
             "\nCircle Perimerter: "+computePerimeter()+
             "\nCircle Color:      "+this.color+
             "\nCircle Cordinates: ("+this.x+","+this.y+")";
    }


}

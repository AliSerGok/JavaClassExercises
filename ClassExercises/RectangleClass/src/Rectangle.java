public class Rectangle{

    double width=1;
    double height=1;

    Rectangle(){}
    Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;

    }

    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2*width+2*height;

    }
    public void printInfo(){
        System.out.println(" Rectangle Area: "+getArea()+"\n Rectangle Perimeter: "+getPerimeter());
    }






}

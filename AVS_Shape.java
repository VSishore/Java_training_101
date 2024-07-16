abstract public class AVS_Shape {
    String color;
    AVS_Shape(){}
    AVS_Shape(String color){
        this.color=color;
    }
    abstract double area();

    void display(){
        System.out.println("the area is: "+area());
    }
}

class AVS_Rectangle extends AVS_Shape{
    int length;
    int breadth;
    AVS_Rectangle(int length,int breadth,String color){
        super(color);
        this.breadth=breadth;
        this.length=length;
    }
    @Override
    double area(){
        return length*breadth;
    }
}
class AVS_Circle extends AVS_Shape{
   double radius;
    AVS_Circle(double radius,String color){
        super(color);
        this.radius=radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
class AVS_Square extends AVS_Shape{
    int side;
    AVS_Square(int side,String color){
        super(color);
        this.side=side;
    }
    @Override
    double area(){
        return side*side;
    }
}

class AVS_Driver{
    void main(){
        AVS_Shape as=new AVS_Square(34,"white");
        as.area();
        System.out.println("-------------------------------");
        as.display();
        System.out.println("-------------------------------");
        AVS_Shape am=new AVS_Circle(123,"Black");
        am.area();
        System.out.println("-------------------------------");
        am.display();
        System.out.println("-------------------------------");
        AVS_Shape ar=new AVS_Rectangle(25,5,"Blue");
        ar.area();
        System.out.println("-------------------------------");
        ar.display();
        System.out.println("-------------------------------");

    }
}



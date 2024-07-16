public interface Shape {
    public static final String color="Plain";

    abstract public void area();

}

class IN_Rectangle implements Shape{
    int length;
    int breadth;
    IN_Rectangle(int length,int breadth){
        this.breadth=breadth;
        this.length=length;
    }

    @Override
    public void area() {
         System.out.println( Math.round(length*breadth));
    }
}

class IN_Circle implements Shape{
    int radius;
    IN_Circle(int radius){
        this.radius=radius;
    }
    @Override
    public void area(){
        System.out.println(Math.round(Math.PI*radius*radius));
    }
}

class INTER_DRIVER{
    void main(){
        IN_Circle ic=new IN_Circle(34);
        ic.area();
        Shape s;
        s=new IN_Circle(24);
        s.area();
    }
}

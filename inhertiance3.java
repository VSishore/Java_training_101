public class inhertiance3 {
    public static void main(){
        Apple ap=new Apple("Sweet","Red","Kashmir");
        Orange or=new Orange("Sour","Orange","Mumbai");
        ap.display();
        System.out.println("--------------------");
        or.display();
    }
}

class Fruit{
    String origin;
    Fruit(){}
    Fruit(String origin){
        this.origin=origin;
    }
}
class Apple extends Fruit {
    String taste;
    String color;
    Apple(String taste,String color,String origin){
        super(origin);
        this.taste=taste;
        this.color=color;
    }
    public void display(){
        System.out.println("The taste os the apple: "+taste);
        System.out.println("The color os the apple: "+color);
        System.out.println("The origin os the apple: "+origin);
    }
}

class Orange extends Fruit {
    String taste;
    String color;
    Orange(String taste,String color,String origin){
        super(origin);
        this.taste=taste;
        this.color=color;
    }
    public void display(){
        System.out.println("The taste os the apple: "+taste);
        System.out.println("The color os the apple: "+color);
        System.out.println("The origin os the apple: "+origin);
    }
}
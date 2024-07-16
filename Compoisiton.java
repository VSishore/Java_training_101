//public class Compoisiton {
//    public static void main(String[] args){
//        Laptop1 lp=new Laptop1();
//        lp.b.model_number=2014;
//        lp.b.presence_of_ssd=true;
//        lp.b.ram_slots=4;
//        lp.b.processor="Intel-i5";
//        System.out.println(lp.b.model_number);
//        System.out.println(lp.b.processor);
//        System.out.println(lp.b.presence_of_ssd);
//        System.out.println(lp.b.ram_slots);
//
//        Laptop1 lp2=new Laptop1();
//        System.out.println(lp2.b.presence_of_ssd);
//
//    }
//
//}
//
//class Motherboard{
//    static int model_number;
//    String processor;
//    int ram_slots;
//    boolean presence_of_ssd;
//}
//
//class Laptop1{
//    static Motherboard b =new Motherboard();
//}


//car system
class Engine{
    String brand;
    double price;
}
class Wheels{
    String brand;
    double price;
}

class Car{
    Engine e=new Engine();
    Wheels w=new Wheels();
}
public class Compoisiton{
    public static void main(String[] args){
        Car c=new Car();
        c.e.brand="Charger";
        c.e.price=2300.0D;
        c.w.brand="Alloy";
        c.w.price=234.0D;

        System.out.println(c.e.brand);
        System.out.println(c.e.price);
        System.out.println(c.w.brand);
        System.out.println(c.w.price);

    }
}
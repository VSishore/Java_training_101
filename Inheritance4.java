//public class Inheritance4 {
//    public static void main(String[] args){
//        Maruti mp = new Maruti("Kishore", 271, "Red", 2500000d);
//        mp.display();
//
//        Nano na = new Nano("Harishwar", 262, "Silver", 250000d);
//        na.display();
//
//        Tvs tv = new Tvs("Loki", 277, "Blue", 25000d);
//        tv.display();
//
//        Pulsar pu = new Pulsar("Ajai", 231, "Blue-Black", 240000d);
//        pu.display();
//    }
//}
//
//class Vehicle {
//    private String model;
//    private int cc;
//
//    public void setVehicle(String model, int cc) {
//        this.model = model;
//        this.cc = cc;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public int getCc() {
//        return cc;
//    }
//}
//
//class Bike extends Vehicle {
//    private String color;
//    private double price;
//
//    public void setBike(String color, double price) {
//        this.color = color;
//        this.price = price;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//class Car1 extends Vehicle {
//    private String color;
//    private double price;
//
//    public void setCar1(String color, double price) {
//        this.color = color;
//        this.price = price;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//class Maruti extends Car1 {
//    private String owner;
//    private long reg_no;
//
//    Maruti(String owner, long reg_no, String color, double price) {
//        this.owner = owner;
//        this.reg_no = reg_no;
//        setCar1(color, price);
//    }
//
//    public void display() {
//        System.out.println("The Owner of the car: " + owner);
//        System.out.println("The reg no is: " + reg_no);
//        System.out.println("The Color is: " + getColor());
//        System.out.println("The price is: " + getPrice());
//    }
//}
//
//class Nano extends Car1 {
//    private String owner;
//    private long reg_no;
//
//    Nano(String owner, long reg_no, String color, double price) {
//        this.owner = owner;
//        this.reg_no = reg_no;
//        setCar1(color, price);
//    }
//
//    public void display() {
//        System.out.println("The Owner of the car: " + owner);
//        System.out.println("The reg no is: " + reg_no);
//        System.out.println("The Color is: " + getColor());
//        System.out.println("The price is: " + getPrice());
//    }
//}
//
//class Tvs extends Bike {
//    private String owner;
//    private long reg_no;
//
//    Tvs(String owner, long reg_no, String color, double price) {
//        this.owner = owner;
//        this.reg_no = reg_no;
//        setBike(color, price);
//    }
//
//    public void display() {
//        System.out.println("The Owner of the car: " + owner);
//        System.out.println("The reg no is: " + reg_no);
//        System.out.println("The Color is: " + getColor());
//        System.out.println("The price is: " + getPrice());
//    }
//}
//
//class Pulsar extends Bike {
//    private String owner;
//    private long reg_no;
//
//    Pulsar(String owner, long reg_no, String color, double price) {
//        this.owner = owner;
//        this.reg_no = reg_no;
//        setBike(color, price);
//    }
//
//    public void display() {
//        System.out.println("The Owner of the car: " + owner);
//        System.out.println("The reg no is: " + reg_no);
//        System.out.println("The Color is: " + getColor());
//        System.out.println("The price is: " + getPrice());
//    }
//}

public class Inheritance4 {
    public static void main(String[] args){
        Maruti mp=new Maruti("Kishore",271,"Red",2500000d);
        mp.display();
        Nano na=new Nano("Harishwar",262,"Silver",250000d);
        na.display();
        Tvs tv=new Tvs("Loki",277,"Blue",25000d);
        tv.display();
        Pulsar pu=new Pulsar("Ajai",231,"Blue-Black",240000d);
        pu.display();
    }
}
class Vehicle{
    private String model;
    private int cc;
    void vehicle(){}

    void vehicle(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }
    public int getCc(){
        return cc;
    }
}
///////////////////////////////////////////////////////////////////////////////////
class Bike extends Vehicle{
    private String color;
    private double price;

    Bike(){}
    Bike(String color,double price){
        this.color=color;
        this.price=price;
    }
    public String getColor(){
        return color;
    }
    public double getprice(){
        return price;
    }

}

class Car1 extends Vehicle{
    private String color;
    private double price;
    Car1(){}

    public Car1(String color, double price) {
        this.color=color;
        this.price=price;
    }

    public String getColor(){
        return color;
    }
    public double getprice(){
        return price;
    }
}
/////////////////////////////////////////////////////////////////////////////////////
class Maruti extends Car1{
    String owner;
    long reg_no;
    Maruti(String owner,long reg_no,String color,double price){
        super(color,price);
        this.owner=owner;
        this.reg_no=reg_no;
    }
    public void display(){
        System.out.println(STR."The Owner of the car: \{owner}");
        System.out.println(STR."The regno is: \{reg_no}");
        System.out.println(STR."the Color is: \{getColor()}");
        System.out.println(STR."the price is: \{getprice()}");
    }
}

class Nano extends Car1{
    String owner;
    Long reg_no;
    Nano(String owner,long reg_no,String color,double price){
        super(color, price);
        this.owner=owner;
        this.reg_no=reg_no;

    }

    public void display(){
        System.out.println(STR."The Owner of the car: \{owner}");
        System.out.println(STR."The regno is: \{reg_no}");
        System.out.println(STR."the Color is: \{getColor()}");
        System.out.println(STR."the price is: \{getprice()}");

    }
}
///////////////////////////////////////////////////////////////////////////////////////
class Tvs extends Bike{
    String owner;
    long reg_no;

    Tvs (String owner ,long reg_no,String color,double price){
        super(color,price);
        this.owner=owner;
        this.reg_no=reg_no;
    }

    public void display(){
        System.out.println(STR."The Owner of the car: \{owner}");
        System.out.println(STR."The regno is: \{reg_no}");
        System.out.println(STR."the Color is: \{getColor()}");
        System.out.println(STR."the price is: \{getprice()}");

    }
}

class Pulsar extends Bike{
    String owner;
    Long reg_no;
    Pulsar (String owner ,long reg_no,String color,double price){
        super(color,price);
        this.owner=owner;
        this.reg_no=reg_no;
    }

    public void display(){
        System.out.println(STR."The Owner of the car: \{owner}");
        System.out.println(STR."The regno is: \{reg_no}");
        System.out.println(STR."the Color is: \{getColor()}");
        System.out.println(STR."the price is: \{getprice()}");
    }
}

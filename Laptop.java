public class Laptop {
    static String clg_used="PANIMALAR";
    String brand;
    int model;
    double price;
    int ram;
    Laptop(){
        //System.out.println("nothing");
    }
    Laptop(String brand){
        this();
        this.brand=brand;
    }
    Laptop(String brand, int model){
        this(brand);
        this.model=model;
    }
    Laptop(String brand, int model, double price){
        this(brand,model);
        this.model=model;
    }
    Laptop(String brand, int model, double price, int ram){
        this(brand,model,price);
        this.ram=ram;
    }

    void display(){
        System.out.println("the brand name: "+brand);
        System.out.println("the model number: "+model);
        System.out.println("the price: "+price);
        System.out.println("the ram is: "+ram);
        System.out.println("the college used: "+Laptop.clg_used);
    }
}

public class Inhertiance2 {
    public static void main(String[] args) {
        Ecar ec = new Ecar(2, 4, "Audi", 2017, 2400000);
        ec.display();
    }
}

class vehicle {
    int model;

    vehicle() {
    }

    vehicle(int model) {
        this.model = model;
    }
}

class car extends vehicle {
    int No_of_doors;
    String brand;
    int price;

    car() {
    }

    car(int No_of_doors, String brand, int model, int price) {
        super(model);
        this.No_of_doors = No_of_doors;
        this.brand = brand;
        this.price = price;

    }
}

class Ecar extends car {
    int battery;

    Ecar(int battery, int No_of_doors, String brand, int model, int price) {
        super(No_of_doors, brand, model, price);
        this.battery = battery;
    }

    public void display() {
        System.out.println(STR."the model name of the car: \{model}");
        System.out.println(STR."the brand name of the car: \{brand}");
        System.out.println(STR."the battery count of the car: \{battery}");
        System.out.println(STR."the Count of the doors: \{No_of_doors}");
        System.out.println(STR."the price of the car is: \{price}");
    }
}
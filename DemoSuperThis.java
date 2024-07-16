public class DemoSuperThis {
    public static void main(){
        OnePlus op=new OnePlus("One plus",25000,234,"Exions");
        //op.SetOs("exinos");
        op.display_details();
    }
}

class Phone{
    private  String os;

    Phone(){}

    public Phone(String os) {
        this.os=os;
    }

    public String getOs(){
        return os;
    }
}
class OnePlus extends Phone{
    String brand;
    double price;
    int model;
    OnePlus(String brand,double price,int model,String os){
        super(os);
        this.price=price;
        this.brand=brand;
        this.model=model;
    }


    public void display_details(){
        System.out.println(STR."the brand of the Phone: \{brand}");
        System.out.println(STR."the price of the Phone: \{price}");
        System.out.println(STR."the model of the Phone: \{model}");
        System.out.println(STR."the OS of the Phone: \{getOs()}");

    }
}

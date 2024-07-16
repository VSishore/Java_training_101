import java.awt.desktop.SystemEventListener;

public class Static_NonStatic {
    //static Book b=new Book(123,"kishore","selvakumar",2345);
    static int a=3;
    String nmae="kishore";
    static {
        System.out.println("static initializer");

    }

    {
        System.out.println("hi");
    }

    public void method1(){
        System.out.println("the m1 mehtod");
    }
    public static void main(String[] args){
        //Static_NonStatic s=new Static_NonStatic();
        short a = 5, b = 10, c = 15;
        a -= 3;
        b *= 2;
        c /= 5;
        System.out.println(a + " " + b + " " + c);

    }


}

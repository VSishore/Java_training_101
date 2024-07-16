import java.util.Arrays;
import java.util.Scanner;

public class Constructor_Overloading {
    public static void main(String[] args) {
      /* Laptop l1=new Laptop();
        Laptop l2=new Laptop("dell");
        Laptop l3=new Laptop("hp",14);
        Laptop l4=new Laptop("apple",16,120000);
        Laptop l5=new Laptop("msi",420,50000,16);
        l1.display();
        System.out.println("**************");
        l2.display();
        System.out.println("**************");
        l3.display();
        System.out.println("**************");
        l4.display();
        System.out.println("**************");
        l5.display();
        System.out.println("**************");*/
     Scanner sc = new Scanner(System.in);
     Laptop[] s=new Laptop[10000];
     boolean b = true;
     while (b) {
      System.out.println("Enter the choice in the integer value: ");
      System.out.println("1.Enter the data\n2.search the data\n3.Exit");
      int m = sc.nextInt();
      switch (m) {
       case 1: {
        Constructor_Overloading.display(s);
        break;
       }

       case 2:{
        b=false;
        break;
       }
       default:{
        System.out.print("Enter the correct value");
       }
      }
     }
    }

    public static void display(Laptop[] s){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the count of data: ");int count=sc.nextInt();
     for(int i=0;i<count;i++){
      System.out.println("*********************************");
      System.out.print("Enter the name: ");String brand=sc.next();
      System.out.print("Enter the model: ");int model=sc.nextInt();
      System.out.print("Enter the price: ");double price=sc.nextDouble();
      System.out.print("Enter the RAM size: ");int ram=sc.nextInt();
      System.out.println("*********************************");
      Laptop li = new Laptop(brand,model,price,ram);
      s[i]=li;
     }
    }

//    public static void search(String s){
//     for(int i=0;)
//     if(Laptop)
//    }

}

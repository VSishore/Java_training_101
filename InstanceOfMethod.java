import java.util.Scanner;

public class InstanceOfMethod {
    public void main(){
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("1.Apple\n2.Pineapple\n3.Orange\n4.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addFruit(new cutApple());
                    break;
                case 2:
                    addFruit(new cutPineapple());
                    break;
                case 3:
                    addFruit(new cutOrange());
                    break;
                case 4:
                    System.exit(120);

            }
        }
    }

    public static void addFruit(cutFruit f){
        if(f instanceof cutApple){
            cutApple cp=(cutApple) f;
            System.out.println(cp.taste);
        } else if (f instanceof cutPineapple) {
            cutPineapple cpp=(cutPineapple) f;
            System.out.println(cpp.taste);
        }else{
            cutOrange co=(cutOrange) f;
            System.out.println(co.taste);
        }
    }
}

class cutFruit{
    String  origin="India";
}

class cutApple extends cutFruit
{
    String taste="Sweet";
}

class cutPineapple extends cutFruit{
    String taste="juice";
}
class cutOrange extends cutFruit{
    String taste="Sour";
}

import java.util.Scanner;

public class food {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String food = sc.nextLine();
//        String res = food.equalsIgnoreCase("veg") ? "Paneer is on the way.....": "Mutton is on the way.......";
//        System.out.println(res);
//        float num = sc.nextFloat();
//        if( num>=100 && num<=200){
//            System.out.println("a");
//        }
//        else{
//            System.out.println("b");
//        }
//program for nested if
//        int num = sc.nextInt();
//        if (num >= 50) {
//            if (num % 4 == 0) {
//                System.out.println("IT is a multiple of 4");
//            } else {
//                if (num % 2 != 0) {
//                    System.out.println("the odd number ");
//                } else {
//                    System.out.println("the even number");
//                }
//            }
//        }
//        else {
//            System.out.println("the number is less than 50");
//        }
// program for eligiblity for blood donation
//        System.out.print("Enter the age: ");
//        int age= sc.nextInt();
//        System.out.print("Enter the weight: ");
//        int weight =sc.nextInt();
//        if (age>=18 && age<=80){
//            if(weight>=55){
//                System.out.println("you are eligible for donation for bloood");
//            }
//            else{
//                System.out.println("you are under weight");
//            }
//        }
//        else{
//            System.out.println("you are not eligible ");
//        }
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        if(year%4==0 ) {
            if (year % 100 == 0 || year%400==0) {

                System.out.println(year + " is a leap year");
            }
            else{

                    System.out.println(year+" is  a leap year");
            }

        }
        else{
            System.out.println(year+" is not a leap year");
        }

    }
}

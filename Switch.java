import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
/*
        System.out.println("enter the two numbers");
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operation \n 1.add \n 2.subtract \n 3.multiplication \n 4.division");
        System.out.print("Enter the choice of yours: ");
        String cal =sc.next();
        switch (cal){
            case "add" -> System.out.println("the result: "+(a+b));
            case "subtract" -> System.out.println("the result: "+(a-b));
            case "multiplication" -> System.out.println("the result: "+(a*b));
            case"division" -> System.out.println("the result: "+(a/b));
            default -> System.out.println("the false operation");
        }
        System.out.println("-------------------------------------------------");
program to print the day
        System.out.print("Enter the number between 0 to 6: "); int day=sc.nextInt();
        switch (day){
              case 0 -> System.out.println("the day is sunday");
              case 1 -> System.out.println("the day is Monday");
              case 2 -> System.out.println("the day is Tuesday");
              case 3 -> System.out.println("the day is Wednesday");
              case 4 -> System.out.println("the day is Thursday");
              case 5 -> System.out.println("the day is Friday");
              case 6 -> System.out.println("the day is Saturday");
              default -> System.out.println("Give the correct numbers in range");
       }

*/
        System.out.print("Enter the marks "); int mark=sc.nextInt();
        mark/=10;
        switch (mark){
            case 10,9: {
                System.out.println("A+");
                break;
            }
            case 8: {
                System.out.println("A");
                break;
            }
            case 7: {
                System.out.println("B+");
                break;
            }
            case 6: {
                System.out.println("B");
                break;
            }
            case 5: {
                System.out.println("C");
                break;
            }
            case 4: {
                System.out.println("D");
                break;
            }
            default: {
                System.out.println("Fail");
                break;
            }


            }




        }
    }


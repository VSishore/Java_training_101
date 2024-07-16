import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        //taking the weight of 5 person and calculate the average of 5 persons weight(result should be in whole number)
        Scanner sc= new Scanner(System.in);
/*
        float a1= sc.nextFloat();
        float a2= sc.nextFloat();
        float a3= sc.nextFloat();
        float a4= sc.nextFloat();
        float a5= sc.nextFloat();
        int weight=(int)(a1+a2+a3+a4+a5)/5;
        System.out.println("the weight: "+weight);
        
 */
// WRITE A PROGRAM TO CALCULATE A TOTAL SALARY OF THE EMPLOYEE FOR THE GIVEN DETAILS
//display the total salary as a double and int
       /* System.out.print("Enter the amount per hour: ");float per=sc.nextFloat();
        System.out.print("No.of hours that you worked"); int hour=sc.nextInt();
        float salary=hour*per;
        System.out.print("Enter the Salary in float: "+(double)salary+"\n");
        System.out.print("Enter the Salary in int: "+(int)salary);

        float a= 1.3f+5.2f+7.4f+4.2f;
        float b= (int)1.3f+(int)5.2f+(int)7.4f+(int)4.2f;
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b);
*/
        //WRITE A PROGRAM TO FIND STRONG NUMBER
        //145=1!+4!+5!=1+24+120=

                int n = sc.nextInt();
                int na=n;
                int sum = 0;

                while (n != 0) {
                    int r = n % 10;
                    sum = sum + fac(r);
                    n = n / 10;
                }
        if(sum==na) {
            System.out.println("strong number");
        }
        else {
            System.out.println("not a strong numnber");
        }


            }

             static int fac(int n) {
                int fa = 1;
                for (int i = 2; i <= n; i++) {
                    fa = fa * i;
                }
                return fa;

           }

    }



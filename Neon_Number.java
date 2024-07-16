import java.util.Scanner;

public class Neon_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");int n=sc.nextInt();
        boolean result=neon_number(n);
        if(result) System.out.println(n+" is a Neon number");
        else System.out.println(n+" is  not a Neon number");
    }
    public static boolean neon_number(int a){
        int sqrt=a*a;
        int rem;
        rem = a;
        int sum=0;
        while(sqrt!=0){
            sum+=(sqrt%10);
            sqrt/=10;
        }
        return rem==sum;
    }
}

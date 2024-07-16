import java.util.Scanner;
//write a program to find the happy number:
public class Challenge {
    public static void main(String[] args){
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");int n=sc.nextInt();
        while(n>10){
            n= iterate(n);
        }
        String result=(n%2==0||n==1) ?("It is YES"):("It is NO");
        System.out.println(result);
    }
    public static int iterate(int a){
        int sum=0;
        while(a!=0){
            int r=a%10;
            sum+=r*r;
            a/=10;
        }
        return sum;
    }
*/

        //1
        int a=1;
        int b=2;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        //2
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        //3
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+" "+b);
        //4
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
        //5
        a=b-a+(b=a);
        System.out.println(a+" "+b);

    }
    }

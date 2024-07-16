import java.util.Scanner;

public class looping {

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        /*
        int m=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        while(m<=n){
            if(m%2==0 && m%3==0){
                System.out.println(m);
                count++;
            }
            m++;
        }
        System.out.println("the count is"+ count);
 character in loops
     for(int a='A';a<='Z';a++){
     char b=(char)a;
     System.out.println(a +"-"+b);
 }
 for(char a='A';a<='Z';a++){
     System.out.println(a +"-"+(0+a));
 }
*/

/*
        long n=sc.nextLong();
        int count=0;
        while (n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
*/
/*
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
*/

/*
        int n=sc.nextInt();
        int sum=1;
        while(n!=0){
            int r=n%10;
            if(r!=0) {
                sum = sum * r;
            }
            n=n/10;
        }
        System.out.println(sum);
*/
/*
        int n=sc.nextInt();
        int sum=0;
        int pro=1;
        while(n!=0){
            int r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        if(sum==pro) System.out.println("is a spy number");
        else System.out.println("is not a spy number");
*/
/*
        int n=sc.nextInt();
        int count=0;

        for(int i=0;i<=n;i++) {

            int num=i;
            int sum = 0;
            int pro = 1;


            while (num != 0) {
                int r = num % 10;
                sum = sum + r;
                pro = pro * r;
                num = num / 10;
            }
            if(sum==pro){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("the count: "+count);
*/
     /*   byte b=2;
        while(b++ <= 2 | b==6){
            ++b;
            b++;
            System.out.println("*");
        }
        System.out.println(b);
      */
        /*
write a program to find reverse of a number
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        System.out.println(rev);
write a program to find a factorial of a number
        int nu=sc.nextInt();
        int fac=1;
        for(int i=2;i<=nu;i++) {
            fac=fac*i;
        }
        System.out.println(fac);
                 */
/*
wirte a program to check whether number is pailndrome or not
        int n=sc.nextInt();
        int num = n;
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        if(rev==num){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not a palindrome");
        }
*/
        System.out.print("Enter the count of Big bricks and cm: ");
        int big=sc.nextInt();
        //int Bcm=sc.nextInt();
        System.out.println("Enter the count of Small bricks: ");
        int small=sc.nextInt();
        //int Scm=sc.nextInt();
        System.out.println("the Goal to be fixed value: ");
        int fin=sc.nextInt();
        int value=(big*5)+(small);
        if(value==fin){
            System.out.println("The case is successful");
        }
        else{
            System.out.println("the case is unsuccessful");
            System.out.println(value-fin);
        }
    }
}





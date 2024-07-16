import java.util.Scanner;

public class Exercise1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=a+b;
        System.out.println(c);

        //2
        char k=sc.next().charAt(0);
        System.out.println(k);

        //3
        int mark_1= sc.nextInt();
        int mark_2= sc.nextInt();
        int mark_3= sc.nextInt();
        int avg = (mark_1+mark_2+mark_3) /3;
        System.out.println(avg);

        //4
        String my_name= sc.next();
        String friend_name= sc.next();
        System.out.println(my_name + "  " +friend_name);

        //5
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int large = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println(large);


    }


}

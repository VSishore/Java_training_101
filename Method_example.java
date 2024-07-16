import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Method_example {
/*
    /*
    public static void calculator(int a,int b,String choice){
        switch (choice){
            case"addition"->System.out.println("the result: "+(a+b));
            case"subtraction"->System.out.println("the result: "+(a-b));
            case"multiplication"->System.out.println("the result: "+(a*b));
            case"division"->System.out.println("the result: "+(a/b));
        }
    }

 * /
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
//        System.out.println("Enter the choice \n1.addition\n2.subtraction\n3.multiplication\n4.division");
//        String choice=sc.next();
//        calculator(a,b,choice);
        add(a,b);
        sub( a, b);
        mul( a, b);
        div( a, b);
    }
    public static void add(int a,int b){
       System.out.println(a+b);
    }
    public static void sub(int a,int b){
        System.out.println(a-b);
    }
    public static void mul(int a,int b){
        System.out.println(a*b);

    }public static void div(int a,int b){
        System.out.println(a/b);

    }
*/

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
/*
        String c=sc.next();
        char a=c.charAt(0);
        char b=c.charAt(1);
        charAddition(a,b);
        //String c=sc.next();
        String d=sc.next();
        String f=sc.next();
        concetation(c,d,f);
        concetation(c,d);
        short e=sc.nextShort();
        acceptShort(e);
        acceptShort((short) 50);
*/
        String s1=sc.next();
        String s2=sc.next();
        String m=stringShow(s1,s2);
        System.out.println(m);
        String m3=m2();
        System.out.println(m3);
    }
/*
    public static  void charAddition(char a,char b){
        int c=a+b;
        System.out.print(a+" "+b);
        System.out.println("the result is: "+c);
    }
    public static void concetation(String a,String b){
        System.out.println("the concetanation is: "+(a + b));
    }
    public static void concetation(String a,String b,String c){
        System.out.println("the concetanation is: "+(a + b+c));
    }
    public static void acceptShort(short a){
        System.out.println("the result is: "+a);
    }
*/

@org.jetbrains.annotations.NotNull
@org.jetbrains.annotations.Contract(pure = true)
public static String stringShow(String s1, String s2){
    return s1+" "+s2;
}
@Contract(pure = true)
public static @NotNull String m2(){
    String s="kishore";
    return s;
}

}

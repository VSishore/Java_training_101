import java.util.Scanner;

public class Pattern_program {
    public static void main(String[] args){
        int a=10;
        while(a>=0){
            System.out.print(a+" ");
            a--;

    }
        System.out.println();
        System.out.println(a++);
        while(a<=10){
            System.out.print(a+" ");
            a++;

        }
        System.out.println();
        /*
         *
         **
         ***
         ****
         *****
         */
        for(int i=0;i<5;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        /*
        *****
        ****
        ***
        **
        *
         */
        for(int i=0;i<5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        /*
        *****
        *****
        *****
        *****
        *****
         */
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        StringBuilder name =new StringBuilder("kishore");
        name=name.reverse();
        for(int i=0;i<name.length();i++){
            for(int j=i;j>=0;j--){
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        String name1 = "kishore";
        for(int i=0;i<name.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(name1.charAt(j));
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        int count=name.length();
        for(int i=0;i<count;i++){
            for(int j=count;j>i;j--){
                System.out.print(" ");
                System.out.print(name.charAt(j-1));
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");

    }

}

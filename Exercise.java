public class Exercise {
    public static void main(String[] args) {
        java.util.Scanner sc =new java.util.Scanner(System.in);
        //1
        int num =sc.nextInt();
        if(num>0)
            System.out.println("the number is positive");
        else if(num==0)
            System.out.println("The number is Zero");
        else
            System.out.println("The number is negative");
        System.out.println("------------------------------------");

        //2
        int total=sc.nextInt();
        if(total ==100)
            System.out.println("Excellent");
        else if(total>=91 )
            System.out.println("A+");
        else if(total >=81 )
            System.out.println("A");
        else if(total >=71 )
            System.out.println("B+");
        else if(total>=61 )
            System.out.println("B");
        else if(total>=51 )
            System.out.println("C");
        else if(total>=40 && total <=50 )
            System.out.println("D");
        else
            System.out.println("Fail");
        System.out.println("------------------------------------");

        //3
        System.out.print("Enter the age: ");
        int age= sc.nextInt();
        if(age>=1 && age<=12)
            System.out.println("you are child");
        else if(age>=13 && age<=20)
            System.out.println("you are teenager");
        else if(age>=21 && age<=29)
            System.out.println("you are teenager adult");
        else if(age>=30 && age<=59)
            System.out.println("you are Adult");
        else
            System.out.println("you are the Aged person");
        System.out.println("------------------------------------");

        //4
        System.out.println("Enter three numbers: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
//        if(a>b && a>c){
//            System.out.println("the number a is greater");
//        }
//        else if(c>a && c>b){
//            System.out.println("the number c is greater");
//        }
//        else{
//            System.out.println("the number b is greater");
//        }
        if(a>b){
            if(a>c){
                System.out.println("A is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater");
            }
            else {
                System.out.println("C is greater");
            }
        }
        System.out.println("------------------------------------");

        //5
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        if(year%4==0 && (year%400==0 || year%100 !=0) ) {
                System.out.println(year+" is  a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}

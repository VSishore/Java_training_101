import java.util.Random;
import java.util.Scanner;
public class Atm_driver {
    //generate otp
    public static int generateOtp() {
        Random rc = new Random();
        return rc.nextInt(100000,900000) ;
        /*
        int min=1000;
        int max=9999;
        int rand=(int)(Math.random()*(max-min)+min);
        System.out.println(rand);
         */

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=generateOtp();
        System.out.println(num);
        boolean b= true;
        while (b) {
            System.out.println("*****AK Bank*****");
            System.out.println("1.withdraw\n2.depoist\n3.checkbalance\n4.Exit");
            System.out.println("*****************");
            System.out.print("enter your need: ");String result = sc.next();
            switch (result.toLowerCase()){
                case"depoist":{
                    System.out.print("Enter the amount to depoist: ");long amount = sc.nextLong();
                    int otp=generateOtp();
                    System.out.println("Your otp is: "+otp);
                    System.out.print("Enter your Otp: "); int rec=sc.nextInt();
                    if (rec == otp) {
                        String res = Atm.deposit(amount);
                        System.out.println(res);
                    }else{
                        System.out.println("Enter the correct otp");
                        System.out.println(Atm.check_balance());
                    }
                        break;

                }
                case"withdraw":{

                    System.out.print("Enter the amount to withdraw: ");long with_amt=sc.nextLong();
                    int otp=generateOtp();
                    System.out.println("Your otp is: "+otp);
                    System.out.print("Enter your Otp: "); int rec=sc.nextInt();
                    if(rec==otp) {
                        String res = Atm.withdraw(with_amt);
                        System.out.println(res);
                    }
                    else{
                        System.out.println("Enter the correct otp");
                        System.out.println(Atm.check_balance());
                    }
                    break;
                }
                case "checkbalance":{
                    String res=Atm.check_balance();
                    System.out.println(res);
                    break;
                }
                case"exit":{
                    b=false;
                    break;
                }
                default:{
                    System.out.println("Enter the name correctly and check the spell");
                }
            }
            System.out.println("-----------------");
        }
    }
}

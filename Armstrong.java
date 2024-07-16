import java.util.Scanner;

public class Armstrong {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        armstrong(n);
    }
    public static int pow(int count,int r){
        int cube=1;
        for(int i=1;i<=count;i++){
            cube*=r;
        }
        return cube;
    }
    public static int count(int r) {
//        String s = Integer.toString(r);
//        int length = s.length();
//        return length;
        int count=0;
        while(r!=0){
            count++;
            r/=10;
        }
        return count;
    }
    public static void armstrong(int n){
        int num=n;
        //System.out.print("Enter the count of the number: ");int count=sc.nextInt();
        int count=count(n);
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum+=pow(count,r);
            n=n/10;
        }
        if(sum==num){
            System.out.println(num+" is a Armstromng number");
        }
        else{
            System.out.println(num+"is not a Armstromng number");
        }

    }

}

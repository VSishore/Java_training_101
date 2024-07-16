

public class Atm {

    static long amount=0;
    static long total_withdraw=0;
    static long daily_deposit=0;

    public static String withdraw(long n){
        if(n>0&n%500==1){
            return "the withdraw amount is out of limit";
        }
         if (amount==0) {
            return "you need to deposit some amount to withdraw";
        }
        if(total_withdraw<100000) {
            total_withdraw+=n;
            amount=amount-n;}
        else{
            return "you have reached the limit of with draw";
        }
        return ("you are successfully withdrawn\nyou are left is balance of "+amount);
    }

    public static String deposit(long n){
        if(n<0){
            return "maximum limit reached or depoist of create number";
        }
        daily_deposit+=n;
        if(daily_deposit<=100000){
            amount+=n;
            return "the amount deposited successfully with a total of "+amount;
        }

        return "the daily depoist is satisified  beacuse it reached the limit of 100000";

    }
    public static String check_balance(){
        return "you are with the total amount of "+amount+" with the total withdraw of the day is "+total_withdraw+" with day depoist of "+daily_deposit;
    }

}

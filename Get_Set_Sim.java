import java.util.Locale;

public class Get_Set_Sim {
    private long sim_no;
    private String sim_provider;
    private double sim_rate=2345;

    public void displaySimInfo() {
        System.out.println("SIM Number: " + getSim_no());
        System.out.println("SIM Provider: " + getSim_provider());
        System.out.println("SIM Rate: $" + getSim_rate());
    }
    public double getSim_rate() {
        return sim_rate;
    }

    public String getSim_provider() {
        return sim_provider;
    }

    public void setSim_provider(String sim_provider) {
        if(sim_provider.equalsIgnoreCase("JIO")||sim_provider.equalsIgnoreCase("airtel")) {
            this.sim_provider = sim_provider;
        }
        else{
            System.out.println("Enter valid string==>jio or airtel");
        }
    }

    public long getSim_no() {

        return sim_no;
    }

    public void setSim_no(long sim_no) {
        if(count_number(sim_no)==10) {
            this.sim_no = sim_no;
        }else{
            System.out.println("Invalid number");
        }

    }
    public static int count_number(long num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
}

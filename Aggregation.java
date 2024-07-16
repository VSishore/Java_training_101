import java.util.Scanner;

public class Aggregation {
    public static void main(String[] args) {
//        Mobile mb = new Mobile();
//        mb.add_sim(new Sim());
//        Mobile mb2=new Mobile();
//        mb2.add_sim(new Sim());
//        mb.m.phone_no =9345623263L;
//        mb2.sim_slot=2;
//        System.out.println(mb.m.phone_no+" "+mb.sim_slot);
//        System.out.println(mb2.m.phone_no+" "+ mb2.sim_slot);
//        mb.remove_sim();
//        mb.remove_sim();
//        mb.add_sim(new Sim());
//        //System.out.println(mb.m.phone_no+" "+mb.sim_slot);
        Mobile m=new Mobile();
        while(true){
            System.out.println("\n1.Insert Sim \n2.Remove Sim\n3.Exit");
            System.out.print("Enter your Choice: ");
            Scanner sc =new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice){
                case 1:{
                    m.add_sim(new Sim());
                    break;
                }
                case 2:{
                    m.remove_sim();
                    break;
                }
                case 3: {
                    System.exit(2401);
                }
                default:{
                    System.out.println("Enter the correct numbefr to get output");
                }
            }
        }

    }
}

class Sim{
     long phone_no=2345678912L;
}

class Mobile{
    int sim_slot;
    Sim m;
    public void add_sim(Sim m){
        if(this.m==null){
            this.m=m;
            System.out.println("Sim inserted successfully");
        }
        else{
            System.out.println("Sim is already there");
        }
    }
    public void remove_sim(){
        if(this.m!=null) {
            this.m = null;
            System.out.println("Sim is removed Successfully");
        }
        else{
            System.out.println("Sim is not present");

        }
    }
}

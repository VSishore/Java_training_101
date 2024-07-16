public class Prime {
    private int number;

    public void set_number(int number){
        int count=0;
        for(int i=2;i<number;i++){
            if(number%i==0) count++;
        }
        if(count==0){
            this.number=number;
        }
        else{
            System.out.print("Invalid number");
        }
    }
    public int get_number(){
        return number;
    }
}

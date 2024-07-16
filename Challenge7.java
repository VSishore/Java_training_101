import java.util.Scanner;

public class Challenge7 {
    void main(){
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[0];
        main(arr);
        double[] b =new double[0];
        main(b);
        while (true){
            System.out.println("\n1.For Employee\n2.For Manager\n3.Exit");
            System.out.print("Enter your choice");int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the Number of working Hours: ");int no_of_workhours=sc.nextInt();
                    System.out.print("Enter the Base Salary: ");double base_salary=sc.nextDouble();
                    EEmployee ee=new EEmployee(no_of_workhours,base_salary);
                    System.out.println(ee.calculate_Salary());
                    break;
                case 2:
                    System.out.print("Enter the Base Salary: ");double base_salary_manager=sc.nextDouble();
                    System.out.print("Enter the Bonus: ");double bonus_manager=sc.nextDouble();
                    CManager cm=new CManager(bonus_manager,base_salary_manager);
                    System.out.println(cm.calculate_Salary());
                    break;
                case 3:
                    System.exit(102);
            }
        }
    }
    void main(int[] args){
        System.out.println("HI INT array");

    }
    void main(double[] args){
        System.out.println("HI double");
    }
}

class Company{
    private double base_salary;
    Company(){}

    Company(double base_salary){
        if(base_salary>=0)
            this.base_salary=base_salary;
        else {
            System.out.println("the amount is wrong and must be greater than zero");
        }

    }

    public double getBase_salary(){
        base_salary=base_salary/(30);
        return base_salary;
    }

    public double calculate_Salary(){
        return base_salary;
    }
}

class EEmployee extends Company{
    int No_of_work_hours;


    EEmployee(int No_of_work_hours,double base_salary){
        super(base_salary);
        if(No_of_work_hours<=24)
        this.No_of_work_hours=No_of_work_hours;
        else
            System.out.println("the No.of working salary must be always less than 24");
    }

    @Override
    public double calculate_Salary(){
        return  No_of_work_hours*getBase_salary();
        //double per_dy=getBaseSalary()/28;
        //double per_hrs=per_dy/9;

    }
}
class CManager extends Company{
    double bonus;

    CManager(double bonus,double base_salary){
        super(base_salary);
        this.bonus=bonus;
    }

    @Override
    public double calculate_Salary(){
        return  bonus+getBase_salary();
    }
}
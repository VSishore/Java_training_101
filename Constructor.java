public class Constructor {

    enum Gender{
        male,female,other
    }
    static String company_name="Panimalar";
    String name;
    int emp_id;
    double salary;
    String desgination;
    Gender gender;


    Constructor(String name,int emp_id,double salary,String desgination,Gender gender){
        this.name=name;
        this.emp_id=emp_id;
        this.salary=salary;
        this.desgination=desgination;
        this.gender=gender;
    }

    public void display_details(){
        System.out.println("*****Employee Details*****");
        System.out.println("the name of the employee is: "+name);
        System.out.println("the Employee ID: "+emp_id);
        System.out.println("the gender is: "+gender);
        System.out.println("the salary: "+salary);
        System.out.println("the desgnation is: "+desgination);
        System.out.println("the Company name: "+company_name);
        System.out.println("**************************");

    }

}

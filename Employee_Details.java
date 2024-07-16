import java.util.Scanner;

public class Employee_Details {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            String name= sc.next();
            int emp_id=sc.nextInt();
            double salary=sc.nextDouble();
            String desgination= sc.next();
        String genderInput = sc.next();
        Constructor.Gender gender = Constructor.Gender.valueOf(genderInput);

            Constructor c = new Constructor(name,emp_id,salary,desgination,gender);
            c.display_details();

    }
}

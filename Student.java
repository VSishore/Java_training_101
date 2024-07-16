import java.math.BigInteger;

public class Student {
    static String College_name="Panimalar Engineering College";
    String Student_name;
    int Roll_no;
    long Phone_number;
    char grade;

    public  void display_details(){
        System.out.println("/////******Student-Report******/////");
        System.out.print("Name of the Student: "+Student_name);
        System.out.println();
        System.out.print("Roll-No: "+Roll_no);
        System.out.println();
        System.out.print("Phone_number: "+Phone_number);
        System.out.println();
        System.out.print("College Name: "+Student.College_name);
        System.out.println();
        System.out.print("Grade of the Student: "+grade);
        System.out.println();
        System.out.println("/////**************************/////");
    }
}

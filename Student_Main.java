public class Student_Main {
    public static void main(String[] rgs){
        Student s=new Student();
        s.Student_name="Kishore Udaiyar";
        s.Roll_no=271;
        s.Phone_number= 9345623263L;
        s.grade='A';

        Student s1=new Student();
        Student.College_name="Panimalar Medical College";
        s1.Student_name="Ajai S";
        s1.Roll_no=231;
        s1.Phone_number= 3456778993L;
        s1.grade='A';

        Student s2=new Student();
        Student.College_name="Panimalar Engineering college";
        s2.Student_name="Kishore Udaiyar";
        s2.Roll_no=271;
        s2.Phone_number=9345623263L;
        s2.grade='A';

        s2.display_details();
        s.display_details();
        s1.display_details();


    }
}

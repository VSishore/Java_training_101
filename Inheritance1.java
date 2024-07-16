public class Inheritance1 {
    public static void main(String[] args){
        Parent p=new Parent();
        child c=new child();
        System.out.println(p.var1);
        System.out.println(c.var1);
        System.out.println(c.var2);
        System.out.println("-----------------");
        p.m2();
        p.m1();
        System.out.println("-----------------");
        c.m4();
        c.m2();
        c.m3();
        c.m1();
    }
}

class Parent{
    private int x=20;
    int var1=10;
    public static void m1(){
        System.out.println("Parent in static m1");
       /// System.out.println(x);   ///CTE bz static only access only static value/variable
    }
    public void m2(){
        System.out.println(var1*10);
        System.out.println(x);
    }
}

class child extends Parent{
    int var2=20;
    public static void m3(){
        System.out.println("Chile in static");
        //System.out.println(var1); //it's not static variable / context
    }
    public  void m4(){
        System.out.println(var2*2);
        System.out.println(var1);
    }
}

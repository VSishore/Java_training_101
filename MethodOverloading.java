//write a pogram to find area of the shape
  class MethodOverloading {

    public static void area(double radius){
        System.out.println("the area is: "+(radius*radius));
    }
    public static void area(double height,double base){
        System.out.println("the area of the triange: "+(0.5*base*height));
    }
    public static void area(float length,float bradth ){
        System.out.println("the area of the triange: "+(length*bradth));
    }

}

class MethodOverloading2{
    //write a program to perform mathical operator(+)
    public void add(int a,int b){
        System.out.println("the addition is: "+(a+b));
    }
    public void add(int a ,int b,int c){
        System.out.println("the addition is: "+(a+b+c));
    }
    public void Sub(int a,int b){
        System.out.println("the Subtraction is: "+(a-b));
    }
    public void Sub(int a,int b,int c){
        System.out.println("the subtraction result is: "+Math.abs(a-b-c));
    }
    public void multiple(int a,int b){
        System.out.println("the Multiplcation is: "+(a*b));
    }
    public void multiple(int a ,int b,int c){
        System.out.println("the Multiplication is: "+(a*b*c));
    }
    public void divide(int a,int b){
        if(a>b)
            System.out.println("the Division is: "+(a/b));
        else
            System.out.println("the Division is: "+(b/a));
    }
}



 class MethodDriver{
    void main(){

        //static method overloading
        MethodOverloading.area(23);
        MethodOverloading.area(25,2);
        MethodOverloading.area(25d,4d);
        System.out.println("-------------------------------------------------");
        //2
        MethodOverloading2 mo2=new MethodOverloading2();
        mo2.add(2,3);
        mo2.add(4,5,6);
        mo2.Sub(3,4);
        mo2.Sub(23,9,8);
        mo2.multiple(2,3);
        mo2.multiple(56,34,56);
        mo2.divide(2,10);
    }

}

public class MethodOverridimg {
    void main(){
        //same reference
        ShutBike sb=new ShutBike();
        sb.move();
        System.out.println("------------------------");

        ShutCar sc=new ShutCar();
        sc.move();
        System.out.println("------------------------");

        ShutVehicle sv=new ShutVehicle();
        sv.move();
        System.out.println("------------------------");
        //different

        ShutVehicle sv1;
        sv1=new ShutBike();
        sv1.move();
        System.out.println("------------------------");



    }

}
class ShutVehicle{
     void move(){
        System.out.println("Vehivle is moving");
    }
}
class ShutCar extends ShutVehicle{
    @Override
    public void move(){
        System.out.println("Car is moving");
    }
}
class ShutBike extends ShutVehicle{
    @Override
    public void move(){
        System.out.println("Bike is moving");
    }
}


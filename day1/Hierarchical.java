package Day1;
class Vehicle{
    Vehicle(){
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("This is a car");
    }
}
class Bus extends Vehicle{
    Bus(){
        System.out.println("This Vehicle is a Bus");
    }
}


public class Hierarchical {
    public static void main(String[] args){
        Car carobj=new Car();
        Bus busobj=new Bus();
    }
}

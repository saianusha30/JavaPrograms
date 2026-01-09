package Day1;
class vehicle{
    vehicle(){
        System.out.println("This is a vehicle");
    }
}
class car extends vehicle{
    car(){
        System.out.println("This vehicle is a car");
    }
}

public class Singleinheritance {
    public static void main(String[] args) {
        car obj= new car();
    }
    
}

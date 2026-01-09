package day1;
class SolarSystem{

}
class Earth extends SolarSystem{

}
class Mars extends SolarSystem{

}
class Moon extends Earth{

}


public class Hybrid {
    public static void main(String[] args) {
        SolarSystem s=new SolarSystem();
        Earth e =new Earth();
        Mars m=new Mars();
        Moon mo=new Moon();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof SolarSystem);
        System.out.println(m instanceof SolarSystem);
        
    }
    
}

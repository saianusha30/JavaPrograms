package Day1;

class Animal {
    Animal() {
        System.out.println("This is an animal");
    }
}

class Mammal extends Animal {
    Mammal() {
        System.out.println("This is a mammal");
    }
}

class Dog extends Mammal {
    Dog() {
        System.out.println("This is a dog");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        new Dog();
    }
}

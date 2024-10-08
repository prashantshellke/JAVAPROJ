package InheritanceInterface;

interface Animal {
    void sound();
}

abstract class Mammal implements Animal {
    abstract void run();
}

class Dog extends Mammal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void run() {
        System.out.println("Dog runs");
    }
}

class Interface7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.run();
    }
}

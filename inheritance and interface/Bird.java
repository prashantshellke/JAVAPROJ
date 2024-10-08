package InheritanceInterface;

public class Bird {
    void fly() {
        System.out.println("Bird flies");
    }
}

class Sparrow extends Bird {
    void sing() {
        System.out.println("Sparrow sings");
    }
}

class Eagle extends Bird {
    void hunt() {
        System.out.println("Eagle hunts");
    }
}

class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.sing();

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.hunt();
    }
}
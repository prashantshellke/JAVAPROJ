package InheritanceInterface;

public class Building {
    final void construction() {
        System.out.println("Building construction");
    }
}

class House extends Building {
    void display() {
        construction(); // Can't override construction method
    }
}

class FinalMethodInheritanceExample {
    public static void main(String[] args) {
        House house = new House();
        house.display();
    }
}
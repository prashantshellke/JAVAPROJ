package InheritanceInterface;

public class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

class Fiction extends Book {
    Fiction(String title) {
        super(title);
    }

    void display() {
        System.out.println("Book title: " + title);
    }
}

class ThisKeywordInheritanceExample {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Harry Potter");
        fiction.display();
    }
}
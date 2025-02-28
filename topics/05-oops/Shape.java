// Polymorphism

class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();  // Parent reference to child object
        shape.draw();  // Calls Circle's draw()

        shape = new Rectangle();  // Parent reference to another child object
        shape.draw();  // Calls Rectangle's draw()
    }
}

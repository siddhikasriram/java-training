class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }

    void display() {
        System.out.println("Engine Type: " + type);
    }
}

class Car {
    String brand;
    Engine engine; // Aggregation - Contains the object of another class

    Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
        engine.display();
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("Ford Mustang", engine);
        car.display();
    }
}

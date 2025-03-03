// Car.java
class Car {
    // Attributes
    String car_color;
    String car_brand;
    int fuel_tank;
    double mileage;

    // Constructor
    Car(String car_color, String car_brand, int fuel_tank, double mileage) {
        System.out.println("Welcome to the car garage!");
        this.car_color = car_color;
        this.car_brand = car_brand;
        this.fuel_tank = fuel_tank;
        this.mileage = mileage;
    }

    // Methods
    void start() {
        System.out.println(car_brand + " is starting.");
    }

    void stop() {
        System.out.println(car_brand + " is stopping.");
    }

    void service() {
        System.out.println(car_brand + " needs servicing.");
    }

    // Main method to create objects and test functionality
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota", 50, 15.5);
        Car car2 = new Car("Blue", "Honda", 45, 18.2);
        Car car3 = new Car("Black", "Ford", 60, 12.8);
        Car car4 = new Car("White", "BMW", 55, 14.3);

        car1.start();
        car2.stop();
        car3.service();
        car4.start();
    }
}
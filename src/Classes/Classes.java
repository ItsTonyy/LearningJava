package Classes;

public class Classes {
    public static void main(String[] args) {
        Car car1 = new Car("ferrari", "purosangue", "red");
        Car car2 = new Car("honda", "civic sport", "gray");
        Car car3 = new Car("toyota", "civic", "red");

        car3.setModel("corolla");
        car1.setColor("yellow");
        car3.setColor("black piano");

        System.out.println(car1.carToString());
        System.out.println(car2.carToString());
        System.out.println(car3.carToString());
    }
}

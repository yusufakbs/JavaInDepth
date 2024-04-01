package Interface;

public class Bat extends Mammal implements Flyable{
    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Bat "+ name + "is flying");
    }

    @Override
    public void land() {
        System.out.println("Bat "+ name + "is flying");

    }
}

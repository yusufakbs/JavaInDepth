package Interface;

abstract public class Bird extends Animal implements Flyable{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Bird "+ name + "is flying");
    }

    @Override
    public void land() {
        System.out.println("Bird "+ name + "is landing");

    }
}

package Interface;

public class Test {

    private static void makeFly(Flyable flyable){
        System.out.println("Fly!");
        flyable.fly();
        System.out.println("Land!");
        flyable.land();
    }
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon("Taklaci ");
        pigeon.fly();
        pigeon.land();

        Hawk hawk = new Hawk("makeFly(hawk); ");
        hawk.fly();
        hawk.land();

        Bird bird = new Pigeon("Paçalı ");
        bird.fly();
        bird.land();

        Flyable flyable = new Pigeon("Postacı ");
        flyable.fly();
        flyable.land();

        Bat bat = new Bat("Dark Knight ");
        bat.fly();
        bat.land();

        Flyable flyable1 = new Bat("Vampire");
        flyable1.fly();
        flyable1.land();

        makeFly(hawk);
        makeFly(bat);
    }
}

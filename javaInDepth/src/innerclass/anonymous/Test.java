package innerclass.anonymous;

public class Test {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void perform() {
                System.out.println("Created.");
            }
        };

        myInterface.perform();

        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void perform() {
                System.out.println("Name: " + getName());
            }
        };

        abstractClass.perform();

        TestClass testClass = new TestClass();
        testClass.perform();

        TestClass testClass1 = new TestClass(){
            @Override
            public void perform() {
                System.out.println("Class name: Test");
            }
        };

        testClass1.perform();


    }
}

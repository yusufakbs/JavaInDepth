package innerclass.statics;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.external = 4;
        Outer.Inner inner = new Outer.Inner();
        Outer.externalStatic = 10;
        inner.internal = 20;
        inner.printValues();
    }
}

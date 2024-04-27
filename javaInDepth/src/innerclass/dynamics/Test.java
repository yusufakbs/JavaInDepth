package innerclass.dynamics;

import innerclass.dynamics.Outer;

public class Test {
    public static void main(String[] args) {
        Outer outer  = new Outer();
        outer.external = 3;

        Outer.Inner inner = outer.new Inner();
        inner.internal = 4;
        inner.printValues();

    }
}

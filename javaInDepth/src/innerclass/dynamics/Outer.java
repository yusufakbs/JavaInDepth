package innerclass.dynamics;

public class Outer {

    int external;

    public class Inner{
        int internal;
        public void printValues(){
            System.out.println("In : " + internal);
            System.out.println("Out: " + external);
        }
    }
}

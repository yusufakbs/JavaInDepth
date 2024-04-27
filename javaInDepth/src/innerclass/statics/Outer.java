package innerclass.statics;

public class Outer {

    int external;
    static int externalStatic;

    public static class Inner{
        int internal;
        public void printValues(){
            System.out.println("In : " + internal);
            //System.out.println("Out: " + external);
            System.out.println("Out : " + externalStatic);
        }
    }
}
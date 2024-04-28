package console;

import java.util.Formatter;

public class FormatterTest {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        int i = 3;
        String s = "Godoro";
        double d = 3.5;
//        formatter.format("Tamsayı %d \r\nKatar %s \r\nKesirli %f ",i,s,d);

        System.out.printf("Tamsayı %10d " +
                "\r\nKatar %s " +
                "\r\nKesirli %f ",i,s,d);
    }
}

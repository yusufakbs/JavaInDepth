package console;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamsayı giriniz:");
        int i = sc.nextInt();
        System.out.println("Girilen tamsayı: " + i);
        System.out.println("String giriniz:");
        String s = sc.next();
        System.out.println("Girilen katar : " + s);
        System.out.println("Double giriniz:");
        double d = sc.nextDouble();
        System.out.println("Girilen kesirli : " + d);
        sc.close();
    }
}

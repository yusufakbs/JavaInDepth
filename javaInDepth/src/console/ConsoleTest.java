package console;

import java.io.IOException;

public class ConsoleTest {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");
        System.out.println(3);
        System.out.println("Değer : " + 4 );
        System.err.println("Godoro");

        int i =  System.in.read();
        System.out.println("Okunan : " + i);

        byte[] buffer = new byte[100];
        int actual = System.in.read(buffer);
        System.out.println("Okunan sayısı : " + actual);

        for (int j = 0; j < actual; j++) {
            byte b = buffer[j];
            System.out.println("Byte : " + (char)b);
        }

    }
}

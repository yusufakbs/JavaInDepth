package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterTest2 {
    public static void main(String[] args) {
        String path = "/Users/yusufakbas/Desktop/northwind_psql-master/test2.txt";

        try(PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(path)))){
            printWriter.write("Godoro\r\n");
            printWriter.write("Hello world\r\n");
            printWriter.write("Hello Turkey\r\n");
            printWriter.write("Hello 2\r\n");
            printWriter.write("Hello 3\r\n");
            printWriter.write("Hello 4\r\n");
            printWriter.write("Hello 5\r\n");
            printWriter.write("Hello Test\r\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

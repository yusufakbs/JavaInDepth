package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        try {
            String path = "/Users/yusufakbas/Desktop/northwind_psql-master/test.txt";
            FileWriter fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            bw.write("Godoro\r\n");
            bw.write("Hello world\r\n");
            bw.write("Hello Turkey\r\n");
            bw.write("Hello USA\r\n");
            bw.write("Hello India\r\n");
            bw.write("Hello India\r\n");
            bw.write("Hello India\r\n");
            bw.write("Hello India\r\n");
        }catch (Exception e){
//            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
        }finally {
            try {
                if(bw != null){
                    bw.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}

package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReaderTest {
    public static void main(String[] args)  {
        //WAY 1

//        String path = "/Users/yusufakbas/Desktop/northwind_psql-master/test2.txt";
//        FileReader reader = new FileReader(path);
//        try (BufferedReader br = new BufferedReader(reader)){
//            String text = "";
//            String line =null;
//            while ((line = br.readLine()) != null){
//                text += line + "\r\n";
//            }
//            System.out.println("Text : " + text);
//        }

        //WAY 2
        Path path2 = Paths.get("/Users/yusufakbas/Desktop/northwind_psql-master/test2.txt");
        try (BufferedReader br = Files.newBufferedReader(path2)){
            StringBuilder builder = new StringBuilder();
            String line =null;
            while ((line = br.readLine()) != null){
                builder.append(line).append("\r\n");
            }
            System.out.println(builder.toString());
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

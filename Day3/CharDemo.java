package com.ff.javaio.Day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDemo {
    public static void main(String[] args) throws IOException {
        /*
        字符流，以字符为单位读写数据
        Reader
            转换流  InpuSreamReader
            FileReader
            BufferedReader
          Writer
            转换流         OutStreamWriter
            FileWriter
            BufferedWriter
         */
        FileReader reader = new FileReader("D:\\test.txt");
        FileWriter writer = new FileWriter("D:\\test1.txt");
        /*int c = ' ';
        while((c= reader.read())!=-1){
            System.out.println((char)c);
            writer.write(c);
        }*/
        //读取为字符类型数组
        char[] c = new char[5];
        int length;
        while((length= reader.read(c))!=-1){
            System.out.println(length);
            writer.write(c,0,length);
        }
        writer.close();
        reader.close();
    }
}

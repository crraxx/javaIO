package com.ff.javaio.Day3;

import java.io.*;

public class CharDemo2 {
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
        BufferedReader breader = new BufferedReader(reader);

        // FileWriter方法中有字符拼接，写入时不会覆盖原来的内容，会在后面继续拼接
        FileWriter writer = new FileWriter("D:\\test1.txt", true);
        BufferedWriter bwriter = new BufferedWriter(writer);

        //读完时返回null；
        //breader.readLine()一次读一行数据
        /*System.out.println(breader.readLine());
        System.out.println(breader.readLine());
        System.out.println(breader.readLine());
        System.out.println(breader.readLine());
        System.out.println(breader.readLine());
        System.out.println(breader.readLine());*/

        String line = null;
        while ((line = breader.readLine()) != null) {
            bwriter.write(line);//一次一行写入
            bwriter.newLine();//新的一行
        }
        bwriter.flush();
        bwriter.close();
        breader.close();

    }
}

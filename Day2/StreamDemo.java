package com.ff.javaio.Day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamDemo {
    public static void main(String[] args) {
        try {
            //创建FileInputStream的对象,指定要输入(读)的文件,文件不存在,抛出异常
            FileInputStream in = new FileInputStream("E:\\demo.txt");
            //每次read();一次,从输入流中读到一个字节,当读取完后会返回-1
            int b = in.read();
            System.out.println(b);
            int b1 = in.read();
            System.out.println(b1);
            int b2 = in.read();
            System.out.println(b2);
            int b3 = in.read();
            System.out.println(b3);
            int b4 = in.read();
            System.out.println(b4);
            int b5 = in.read();
            System.out.println(b5);
            int b6 = in.read();
            System.out.println(b6);
            int b7 = in.read();
            System.out.println(b7);
            int b8 = in.read();
            System.out.println(b8);
            int b9 = in.read();
            System.out.println(b9);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

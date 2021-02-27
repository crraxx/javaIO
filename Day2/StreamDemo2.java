package com.ff.javaio.Day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo2 {
    public static void main(String[] args) throws IOException {
            /*
            创建FileInputStream对象,指定要输入(读)的文件,文件不存在,会抛出异常
             */
        FileInputStream in = new FileInputStream("E:\\demo.txt");
            /*
            创建FileOutputStream对象,会自动创建输出的文件
             */
        FileOutputStream out = new FileOutputStream("F:\\demo.txt");
        int b = 0;
        while ((b = in.read()) != -1) {
            System.out.println(b);
            out.write(b);
        }
        in.close();
        out.close();
    }
}


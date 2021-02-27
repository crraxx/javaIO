package com.ff.javaio.Day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo1 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            /*
            创建FileInputStream对象,指定要输入(读)的文件,文件不存在,会抛出异常
             */
            in = new FileInputStream("E:\\demo.txt");
            /*
            创建FileOutputStream对象,会自动创建输出的文件
             */
            out = new FileOutputStream("F:\\demo.txt");
            int b = 0;
            while ((b = in.read()) != -1) {
                System.out.println(b);
                out.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } /*finally {
            //关闭流对象,释放系统资源
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}


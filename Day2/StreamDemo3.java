package com.ff.javaio.Day2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo3 {
    public static void main(String[] args) throws IOException {
            /*
            创建FileInputStream对象,指定要输入(读)的文件,文件不存在,会抛出异常
             */
        FileInputStream in = new FileInputStream("E:\\demo.txt");
            /*
            创建FileOutputStream对象,会自动创建输出的文件
             */
        FileOutputStream out = new FileOutputStream("F:\\demo.txt");
        /*
        read();每次从输入流中读取一个字符  返回字符值  读完返回-1
        read(byte[] b)每次从输入流中读取一个byte数组长度个字符,返回数组中实际装入内容个数,读完返回-1
         */
        byte [] b = new byte[10];
        int length=0;
        while((length=in.read(b))!=-1){
           /* out.write(b);每次传10个字符,不足10个字符,会自动填充空格*/
            out.write(b,0,length);//向外写出一个byte数组个字节,从数组指定位置开始,写length个字节
        }
        in.read(b);
        in.close();
        out.close();
    }
}


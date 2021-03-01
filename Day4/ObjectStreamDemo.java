package com.ff.javaio.Day4;

import java.io.*;
import java.util.Date;

public class ObjectStreamDemo {
    /*
    对象输入输出流
    对象:内存中的对象
    为什么要将对象输出?
    内存中的数据在电脑关闭,服务器停止时数据就会消失
    有时候需要将这些数据保存起来
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/* 对象的序列化
FileOutputStream out = new FileOutputStream("D:\\demo.txt");
        ObjectOutputStream oout = new ObjectOutputStream(out);

        String s ="abc";
        Date date =new Date();

        oout.writeObject(s);
        oout.writeObject(date);
        oout.close();*/

//反序列化
        FileInputStream in = new FileInputStream("D:\\demo.txt");
        ObjectInputStream oin =new ObjectInputStream(in);
        String s =(String) oin.readObject();
        Date date = new Date();
        System.out.println(s);
        System.out.println(date);
        oin.close();
    }
}

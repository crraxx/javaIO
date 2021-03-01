package com.ff.javaio.Day4;

import java.io.*;

public class ObjectStreamDemo2 {
    /*
    对象输入输出流
    对象:内存中的对象
    为什么要将对象输出?
    内存中的数据在电脑关闭,服务器停止时数据就会消失
    有时候需要将这些数据保存起来
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream in = new FileInputStream("D:\\demo.txt");
        ObjectInputStream oin = new ObjectInputStream(in);
        Student student = (Student)oin.readObject();
        System.out.println(student);
        oin.close();
    }
}

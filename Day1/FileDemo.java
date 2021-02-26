package com.ff.javaio.Day1;

import Util.DateUtil;

import java.io.File;

public class FileDemo {
    /**
     * File类
     * 一个File的对象就表示一个计算机中的文件或者目录(文件夹)
     */
    public static void main(String[] args) {
        /*
        File类的构造方法的3种方式
         */
        /*File f =new File("D:/Users/17509/Desktop/非凡/IO/demo.txt");

        String p="D:/Users/17509/Desktop/非凡/IO/";
        File f1= new File(p,"demo.txt");
        File f2= new File(p,"Api");

        File fp = new File("D:/Users/17509/Desktop/非凡/IO/");
        File f3 = new File(fp,"demo.txt");
        File f4 = new File(fp,"Api");
        */

        File f = new File("D:/Users/17509/Desktop/非凡/IO/demo.txt");//在创建File对象时,不检测文件是否存在
        System.out.println(f.length());//获取文件内容的长度,以字节为单位
        System.out.println(f.getParent());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());//获得相对路径的文件绝对路径
        System.out.println(f.exists());//是否存在

        System.out.println(f.isDirectory());//判断是否为文件夹
        System.out.println(f.isHidden());//判断文件是否为隐藏文件
        System.out.println(f.isAbsolute());//判断文件是否为绝对路径
        System.out.println(f.canWrite());//修改文件属性为可写
        System.out.println(f.canRead());//修改文件属性为可读
        System.out.println(f.canExecute());
        System.out.println(f.getPath());//获得路径
        System.out.println(f.lastModified());//获取最后修改时间
        DateUtil.dateToString(f.lastModified(),"yyyy-MM-dd hh:mm:ss");
    }
}

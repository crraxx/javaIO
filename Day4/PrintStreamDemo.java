package com.ff.javaio.Day4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        打印流,单向的从程序中向外输出数据
        PrintWriter:打印字符流
        案例:例如从服务器端向客户端浏览器输出网页信息
         */
        PrintWriter printWriter = new PrintWriter("D:\\demo.html");
        //print底层也是write实现,只是重载了多种,实现了多种数据类型
        printWriter.print("<h1>起飞</h1>");
        printWriter.print("<h1>起飞</h1>");
        printWriter.print(true);
        //换行是源码中换行
        printWriter.println("<h1>起飞</h1>");
        printWriter.close();
    }
}

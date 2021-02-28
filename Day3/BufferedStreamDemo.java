package com.ff.javaio.Day3;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建输入节点流，负责对文件读写
        FileInputStream in = new FileInputStream("D:\\Users\\17509\\Desktop\\Tule - Fearless.mp3");
        //创建处理对象，内部有一个缓冲数组，默认为8192个字节，包装输入流，提供缓冲功能，也可以设置缓冲区大小
        BufferedInputStream bin = new BufferedInputStream(in);

        FileOutputStream out = new FileOutputStream("E:/新建文件.mp3");
        BufferedOutputStream bout = new BufferedOutputStream(out);

       /* int b= 0;
        while ((b=bin.read())!=-1){
            bout.write(b);
        }*/
        int length = 0;
        byte[] b = new byte[1024];
        while ((length = bin.read(b)) != -1) {
            bout.write(b, 0, length);
        }
        bout.flush();//刷新缓冲区
        bout.close();
        bin.close();
    }
}

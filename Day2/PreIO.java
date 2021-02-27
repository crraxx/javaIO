package com.ff.javaio.Day2;

import java.io.*;

public class PreIO {
    public static void main(String[] args) throws IOException {
        String hello= new String( "hello word!");
        byte[] byteArray= hello.getBytes();
        File file= new File( "d:/test.txt");
        //因为是用字节流来写媒介，所以对应的是OutputStream
        //又因为媒介对象是文件，所以用到子类是FileOutputStream
        OutputStream os= new FileOutputStream( file);
        os.write( byteArray);
        os.close();

        String hell= new String( "hello word!");
        byte[] byteArra= hello.getBytes();
        File fil= new File( "d:/test.txt");
        //因为是用字节流来写媒介，所以对应的是OutputStream
        //又因为媒介对象是文件，所以用到子类是FileOutputStream
        InputStream o= new FileInputStream( file);
        System.out.println(o.read( byteArra));
        o.close();
    }
}

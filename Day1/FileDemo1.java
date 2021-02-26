package com.ff.javaio.Day1;

import Util.StringUtil;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) {
         /*
        createNewFile()  创建文件
        如果已经存在,就不创建了,返回false
        如果不存在,就创建 返回true
        如果盘符/地址在计算机没有,直接抛出异常
         */
       /* File f = new File("G:/demo.txt");
        try {
            System.out.println(f.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(f.delete());//删除文件,存在返回true,不存在,返回false*/

      /*  File f = new File("E:/demo/demo");
        System.out.println(f.mkdir());//只能创建单级文件夹
        f.mkdirs();//可以创建多级文件夹
        f.delete();//删除时文件夹必须为空*/

        File f = new File("E:");
        //获取指定目录下的所有自己的文件或者目录,以字符串形式返回
       /* String [] s = f.list();
        for (String arr:s) {
            System.out.println(arr);
        }*/

        //添加筛选条件,筛选文件
        /*String [] arr = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return StringUtil.subFileType(name).equalsIgnoreCase("txt");
            }
        });
        for (String arr0:arr) {
            System.out.println(arr0);
        }*/

        File[] fs = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return StringUtil.subFileType(name).equalsIgnoreCase("txt");
            }
        });
        for (File ft:fs) {
            System.out.println(ft);
        }

        File f1 =new File("E:/log.txt");
        File f2 =new File("E:/newLog.txt");
        f1.renameTo(f2);//对文件进行重命名
    }
}

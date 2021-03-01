package com.ff.javaio.Day4;

import java.io.Serializable;
/*
需要被序列化类的对象,此类必须要实现Serializable接口
 */
public class Student implements Serializable {
    //会自动为类生成一个 默认ID号,当此类中的内容发生修改后,id号会发生变化
    //实用工具生成一个序列化ID号,这样类发生修改后,此ID依然不会改变
    private static final long serialVersionUID = -7119195593092378008L;
    int num;
    String name;
    //被transient修饰的属性,不能被序列化
    transient String adress;

    public Student(int num, String name,String adress) {
        this.num = num;
        this.name = name;
        this.adress= adress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + ",adress="+adress+'\'' +
                '}';
    }
}

package Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class HM2 {
    /*
    2. 从score.txt文件中读取数据，文件中每行是一个学生的成绩记录，
      内容格式为：
              姓名、英语成绩、语文成绩、数学成绩、JAVA成绩。
     要求:按总分从高到低排序后显示出每个学生的各科成绩和总成绩。
       score.txt文件内容例如:
        姓名##英语##语文##数学##JAVA
        罗霄##68##95##52##81
        刘苗苗##97##97##84##62
        郝笑##75##93##87##52
        李昊阳##86##83##88##68
        雷鸣##54##73##70##91
        李文龙##79##97##96##63
        赵璧辉##52##51##75##97
        姜治文##59##88##60##86
        陈琳##86##53##58##63
        苏浩##79##68##89##55
        李金洲##61##89##72##71
        王欢##82##66##86##70
        王璐##68##60##84##70
     */
    public static void main(String[] args) throws IOException {
        /*
        获取文档中的学生人数
         */
        FileReader fr = new FileReader("D:\\score.txt");
        BufferedReader br = new BufferedReader(fr);
        String str = null;
        int num = 0;//记录学生人数
        while ((str = br.readLine()) != null) {
            num++;
        }
        StudentDemo[] atu = new StudentDemo[num - 1];//建立一个学生类数组用于存储学生信息

        /*
        获取每个学生的信息
         */
        FileReader fread = new FileReader("D:\\score.txt");
        BufferedReader bread = new BufferedReader(fread);
        bread.readLine();  // 读取第一行,为后面读取的每行都是学生的信息

        String s = null;
        int count = 0;
        while ((s = bread.readLine()) != null) {//从文档中的第二行读取,每次读取一个学生的所有信息
            int sum = 0;//总成绩
            String[] infor = s.split("##");    // 存储第二行之后的每个学生的信息,因为文档中每个学生的信息中都有"##",所以split分割出学生的信息
            Integer[] score = new Integer[infor.length - 1];    //分割之后的转数字
            for (int i = 1; i < infor.length; i++) {
                score[i - 1] = new Integer(infor[i]); //获取infor数组中的成绩,存储到score数组中
                sum += score[i - 1]; //求成绩总和
            }
            StudentDemo stu = new StudentDemo(infor[0], score[0], score[1], score[2], score[3], sum);   // 存储每次读取的一位同学的所有信息
            atu[count] = stu;
            count++;
        }
        Arrays.sort(atu);//在Student类中重写了Compare方法,使用总成绩排序

        //遍历输出
        for (StudentDemo i : atu) {
            System.out.println(i);
        }
    }
}


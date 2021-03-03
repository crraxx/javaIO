package Praice.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapDemo {
    /*
    2. 有这样一个字符串"aababcabcdaebcde", 统计字符串中每一个字母出现的次数.
        要求结果:a=5,b=4,c=3,d=2,e=2
     */
    public static void main(String[] args) {
        String s = "aababcabcdaebcde";
        HashSet<Character> h= new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            h.add(s.charAt(i));
        }
        Iterator<Character> iterator = h.iterator();
        while (iterator.hasNext()) {
            char s1 =iterator.next();
            int count=0;
            for (int i = 0; i < s.length(); i++) {
                if (s1==s.charAt(i)){
                    count++;
                }
            }
            System.out.print(s1+":"+count);
            System.out.println();
        }
    }
}

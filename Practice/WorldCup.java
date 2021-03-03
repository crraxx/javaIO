package Practice;

import java.util.*;

public class WorldCup {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1930", "乌拉圭");
        hashMap.put("1934", "意大利");
        hashMap.put("1938", "意大利");
        hashMap.put("1950", "乌拉圭");
        hashMap.put("1954", "西德");
        hashMap.put("1958", "巴西");
        hashMap.put("1962", "巴西");
        hashMap.put("1966", "英格兰");
        hashMap.put("1970", "巴西");
        hashMap.put("1974", "西德");
        hashMap.put("1978", "阿根廷");
        hashMap.put("1982", "意大利");
        hashMap.put("1986", "阿根廷");
        hashMap.put("1990", "西德");
        hashMap.put("1994", "巴西");
        hashMap.put("1998", "法国");
        hashMap.put("2002", "巴西");
        hashMap.put("2006", "意大利");
        hashMap.put("2010", "西班牙");
        hashMap.put("2014", "德国");
        hashMap.put("2018", "法国");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("选择操作1.输入年份  2.输入国家");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("请输入年份:");
                    String time = input.next();
                    int s = Function1(hashMap, time);
                    if (s == 0) {
                        System.out.println("今年没有大力神杯的年份");
                    }
                    continue;
                case 2:
                    System.out.print("请输入国家:");
                    String name = input.next();
                    Function2(hashMap, name);
                    continue;
            }
        }

    }

    public static int Function1(Map hashMap, String time) {
        int flag = 0;
        Set<String> set = hashMap.keySet();
        for (String key : set) {
            if (key.equals(time)) {
                flag = 1;
                System.out.println(hashMap.get(time));
            }
        }
        return flag;
    }

    public static void Function2(Map hashMap, String name) {

        Set<String> set = hashMap.keySet();
        for (String key : set) {
            if (hashMap.get(key).equals(name)) {
                System.out.println(key);
            }
        }
    }
}

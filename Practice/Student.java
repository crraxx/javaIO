package Practice;

import java.io.*;
import java.util.Scanner;

public class Student {


    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("1.注册；2.登录；3.推出");
            Scanner input = new Scanner(System.in);
            int cho = input.nextInt();
            switch (cho) {
                case 1:
                    register();
                    continue;
                case 2:
                    logIn();
                    continue;
                case 3:
                    System.exit(0);
            }
        }
    }

    public static void register() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = input.next();
        System.out.println("请输入密码:");
        String pass = input.next();
        FileWriter writer = new FileWriter("D:\\用户信息.txt", true);
        BufferedWriter bwriter = new BufferedWriter(writer);
        bwriter.write(name);
        bwriter.newLine();
        bwriter.write(pass);
        bwriter.newLine();
        bwriter.flush();
        bwriter.close();
        System.out.println("注册成功");
    }

    public static void logIn() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = input.next();
        System.out.println("请输入密码:");
        String pass = input.next();
        FileReader reader = new FileReader("D:\\用户信息.txt");
        BufferedReader breader = new BufferedReader(reader);
        String line = null;
        int flag= 0;
        while ((line = breader.readLine()) != null) {
            if (line.equals(name)) {
                line = breader.readLine();
                if (line.equals(pass)) {
                   flag=1;
                }
            }
        }
        if (flag==0){
            System.out.println("登陆失败");
        }else {
            System.out.println("登陆成功");
        }
        breader.close();
    }
}

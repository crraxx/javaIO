package Practice;

import java.io.*;

public class Split_Combine {
    public static void main(String[] args) {
        File f = new File("D:\\Users\\17509\\Desktop\\Tule - Fearless.mp3");
        try {
            Split(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件找不到");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读写异常");
        }

        File f1 = new File("E://temp");
        try {
            combain(f1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Split(File file) throws IOException {
        if (file != null || file.exists()) { //文件是否为空,是否存在
            //创建临时文件夹
            File f = new File("E:\\temp");
            //是否存在,不存在创建
            if (!f.exists()) {
                f.mkdirs();
            }
            long size = file.length();//文件大小
            long t = 1024 * 1024;//每份大小
            long count = size % 2 == 0 ? size / t : size / t + 1;//文件个数
            //先输入一个文件
            FileInputStream in = new FileInputStream(file);
            byte[] b = new byte[1024];
            int length = 0;
            for (int i = 0; i < count; i++) {
                int sum = 0;
                FileOutputStream out = new FileOutputStream("E:\\temp\\" + (i + 1) + ".temp");
                while ((length = in.read(b)) != -1) {
                    out.write(b, 0, length);
                    sum += length;
                    if (sum >= t) {
                        break;
                    }
                }
            }
        }
    }

    public static void combain(File file) throws IOException {
        File[] fs = file.listFiles();//获取临时文件中的所有文件
        if (fs.length > 0) {
            FileOutputStream out = new FileOutputStream("D:\\Users\\17509\\Desktop\\Tule - Fearless1.mp3");
            for (int i = 0; i < fs.length; i++) {
                FileInputStream in = new FileInputStream("E:\\temp\\" + (i + 1) + ".temp");
                byte[] b = new byte[1024];
                int length = 0;
                while ((length = in.read(b)) != -1) {
                    out.write(b, 0, length);
                }
                in.close();
            }
            out.close();
            for (int i = 1; i < fs.length; i++) {
                fs[i].delete();
            }
            file.delete();

        }
    }
}

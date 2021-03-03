package Practice;

import java.io.File;
import java.io.FilenameFilter;

public class FileE {
    public static void main(String[] args) {
        File f = new File("E:/steam");
        Function(f);
    }

    public static void Function(File f) {
        File[] fs = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return true;
            }
        });
        for (File ft : fs) {
            if (ft.isDirectory()) {
                System.out.println("显示"+ft+"下所有子目录及其文件"+ft.getAbsolutePath());
                Function(ft.getAbsoluteFile());

            } else {
                System.out.println(ft.getAbsolutePath());
            }
        }
    }
}

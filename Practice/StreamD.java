package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamD {
    public static void main(String[] args) throws IOException {
        File f = new File("E:/demo.txt");
        FileInputStream in = new FileInputStream("E:\\demo.txt");
        FileOutputStream out = new FileOutputStream("F:\\demo.txt");
        byte [] b = new byte[10];
        int length=0;
        while((length=in.read(b))!=-1){
            out.write(b,0,length);
        }
        in.close();
        out.close();
        f.delete();
    }
}


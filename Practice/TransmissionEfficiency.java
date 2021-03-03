package Practice;

import Util.DateUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransmissionEfficiency {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("D:\\Users\\17509\\Desktop\\李鑫组  软工课设.docx");
        FileOutputStream fileoutputStream = new FileOutputStream("E:\\李鑫组  软工课设.docx");

        //单字节传输:6382
       /* long t=System.currentTimeMillis();
        int b = 0;
        while((b=fileInputStream.read())!=-1){
            fileoutputStream.write(b);
        }
        System.out.println("单字节传输:"+(System.currentTimeMillis()-t));*/

        //单字节传输:685
        long t1=System.currentTimeMillis();
        byte[] bytes= new byte[10];
        int b1 = 0;
        while((b1=fileInputStream.read(bytes))!=-1){
            fileoutputStream.write(bytes,0,b1);
        }
        System.out.println("单字节传输:"+(System.currentTimeMillis()-t1));
    }
}

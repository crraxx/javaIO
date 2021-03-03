package Practice;

import java.io.*;

public class Score {
    public static void main(String[] args) throws IOException {
        FileReader reader =new FileReader("D:\\score.txt");
        BufferedReader breader = new BufferedReader(reader);
        FileWriter writer = new FileWriter("D:\\score1.txt");
        BufferedWriter bwriter = new BufferedWriter(writer);
        int c = ' ';
        while((c=breader.read())!=-1){
            if ((char)c !='#'){
                bwriter.append((char)c);
            }
        }
        bwriter.flush();
        bwriter.close();
        breader.close();
    }
}

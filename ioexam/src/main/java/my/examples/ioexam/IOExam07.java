package my.examples.ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class IOExam07 {
    public static void main(String[] args) {
        InputStream in =null;
        FileOutputStream out =null;

        try{
            URL url = new URL("https://www.google.co.kr/?client=safari&channel=iphone_bm");
            in = url.openStream();
            out = new FileOutputStream("google.html");
            int readData = 0;
            while((readData = in.read())!= -1){
                out.write(readData);
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try{in.close();}catch (Exception ignore){}
            try{out.close();}catch (Exception ignore){}
        }
    }
}

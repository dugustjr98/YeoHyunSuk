package my.examples.ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class IOExam07 {
    public static void main(String[] args){
        InputStream in = null;
        OutputStream out = null;
        try{
            URL url = new URL("https://www.naver.com/");
            in = url.openStream();
            out = new FileOutputStream("naver.html");
            int readData = 0;
            while((readData = in.read()) != -1){ // 1개씩 읽는다.
                out.write(readData);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{ in.close(); }catch(Exception ignore){}
            try{ out.close(); }catch(Exception ignore){}
        } // finally
    }
}

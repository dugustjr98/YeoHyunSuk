package my.examples.ioexam;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExam06 {
    public static void main(String[] args) {
        FileInputStream in =null;
        FileOutputStream out =null;
        byte[] bytes =null;
        try{
            long startTime = System.currentTimeMillis();
            in = new FileInputStream("/Users/yeohyeonseog/javaexamfile.pdf");
            out = new FileOutputStream("/Users/yeohyeonseog/javaexamfile1.pdf");
            int readCount =0;
            byte[] buffer = new byte[1024];
            while((readCount = in.read(buffer))!= -1){
                out.write(buffer,0,readCount);
            }
        long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println(estimatedTime);

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try{in.close();}catch (Exception ignore){}
            try{out.close();}catch (Exception ignore){}
        }
    }
}




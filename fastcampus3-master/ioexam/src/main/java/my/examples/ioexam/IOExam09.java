package my.examples.ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOExam09 {
    public static void main(String[] args){
        InputStream in = null;
        OutputStream out = null;
        try{
            long start = System.currentTimeMillis();
            in = new FileInputStream("/tmp/mysqlworkbench.dmg");
            out = new FileOutputStream("/tmp/mysqlworkbench2.dmg");
            int readCount = 0;
            byte[] buffer = new byte[1024];
            while((readCount = in.read(buffer)) != -1){ // 1개씩 읽는다.
                out.write(buffer,0,readCount);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{ in.close(); }catch(Exception ignore){}
            try{ out.close(); }catch(Exception ignore){}
        } // finally
    }
}

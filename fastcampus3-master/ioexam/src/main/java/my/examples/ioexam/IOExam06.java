package my.examples.ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOExam06 {
    public static void main(String[] args){
        InputStream in = null;
        OutputStream out = null;
        try{
            long start = System.currentTimeMillis();
            in = new FileInputStream("/tmp/mysqlworkbench.dmg");
            out = new FileOutputStream("/tmp/mysqlworkbench2.dmg");
            int readData = 0;
            while((readData = in.read()) != -1){ // 1개씩 읽는다.
                out.write(readData);
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

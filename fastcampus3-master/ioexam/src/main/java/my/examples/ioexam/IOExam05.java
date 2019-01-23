package my.examples.ioexam;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class IOExam05 {
    public static void main(String[] args){
        FileInputStream in = null;
        ByteArrayOutputStream out = null;
        byte[] bytearray = null;
        try{
            in = new FileInputStream("bytearray.dat");
            out = new ByteArrayOutputStream();
            int readData = 0;
            while((readData = in.read()) != -1){ // 1개씩 읽는다.
                out.write(readData);
            }

            bytearray = out.toByteArray();
            for(byte b : bytearray){
                System.out.println(b);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{ in.close(); }catch(Exception ignore){}
            try{ out.close(); }catch(Exception ignore){}
        } // finally
    }
}

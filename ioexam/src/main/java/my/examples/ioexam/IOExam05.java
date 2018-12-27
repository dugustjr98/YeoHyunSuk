package my.examples.ioexam;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;


public class IOExam05 {
    public static void main(String[] args) {
// 이거는 파일의 크기가 클때 사용하면 안된다.
        FileInputStream in =null;
        ByteArrayOutputStream out =null;
        byte[] bytes =null;
        try{

            in = new FileInputStream("bytearray2.dat");
            out = new ByteArrayOutputStream();
            int readData = 0;
            while((readData = in.read())!= -1){
                out.write(readData);
            }
            bytes =out.toByteArray();
            for(byte b :bytes){
                System.out.println(b);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try{in.close();}catch (Exception ignore){}
            try{out.close();}catch (Exception ignore){}
        }
    }
}

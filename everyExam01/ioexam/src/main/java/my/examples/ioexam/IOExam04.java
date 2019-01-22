package my.examples.ioexam;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class IOExam04 {
    public static void main(String[] args){
        // 크기가 20인 byte[] 을 선언한다. 값은 임의의 값을 준다.
        byte[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,-1,19,20};
        // byte배열로 부터 정보를 읽어들여 파일에 써라.
        ByteArrayInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new ByteArrayInputStream(array);
            out = new FileOutputStream("bytearray.dat");
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

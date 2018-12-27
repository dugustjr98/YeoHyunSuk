package my.examples.ioexam;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class IOExam04 {
    public static void main(String[] args) {
        //크기가 20인 byte[] 을 선언한다. 값은 임의의 값을 준다.
        byte[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //byte 배열로 부터 정보를 읽어들여 파일에 써라.
        ByteArrayInputStream in =null;   // 선언을 트라이 안에서 하면 클로즈를 못함.
        FileOutputStream out = null;
        try{
            in = new ByteArrayInputStream(array);
            out = new FileOutputStream("bytearray.dat");
            int readData = 0;
            while((readData = in.read())!= -1){ // 1개 씩 읽어주고 -1되면 배열이 끝났다는 것
                out.write(readData);

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
           try{ in.close();}catch(Exception ignore){}
            try{out.close();}catch(Exception ignore){}
            // 체크드 익셉션 기본적으로 이렇게 짬..
        }
    }
}

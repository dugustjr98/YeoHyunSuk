package my.examples.ioexam;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class IOExam08 {
    public static void main(String[] args) {
        //크기가 20인 byte[] 을 선언한다. 값은 임의의 값을 준다.
        byte[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //byte 배열로 부터 정보를 읽어들여 파일에 써라.
        ByteArrayInputStream in =null;   // 선언을 트라이 안에서 하면 클로즈를 못함.
        FileOutputStream out = null;
        try{
            in = new ByteArrayInputStream(array);
            out = new FileOutputStream("bytearray.dat");
            byte[] buffer = new byte[7];
            int readCount = 0;

            while((readCount = in.read())!= -1){ // 최대 7개 읽어들인다. 7바이트씩 나눠서 퍼담음 한바이트씩이아니라 1024나 2048이 가장 적절히 빠르다. 운영체제가 읽어들이는 속도가 1024나 2048 이다.
                out.write(buffer,0,readCount);

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

package my.examples.ioexam;

import java.io.*;
import java.nio.Buffer;

public class IOExam10 {
    public static void main(String[] args) {
        //키보드로부터 한줄씩 입력받아서, 화면에 한줄씩 출력하시오.
        //키보드 : System.in - InputStream
        BufferedReader in = null;
        PrintWriter out =null;
        try{
            //절대경로, 상대경로,
            //절대경로는 c:/로 시작하거나 /로 시작하는 경로
            //상대경로는 프로그램이 실행되는곳을 기준으로 한다. ex) src/main..... 등

            FileReader fr = new FileReader("src/main/java/my/examples/ioexam/IOExam01.java");
            in =new BufferedReader(fr);
            FileWriter fw = new FileWriter("source.txt");
            out = new PrintWriter(fw);
            String line =null;
            int count = 1;
            while((line = in.readLine())!=null){

                out.println(count+" : "+line);
                count++;
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

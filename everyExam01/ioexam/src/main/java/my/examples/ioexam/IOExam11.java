package my.examples.ioexam;

import java.io.*;

public class IOExam11 {
    public static void main(String[] args){
        BufferedReader in = null; // 장식, readLine() 한줄 읽어들인다.
        PrintWriter out = null; // 장식, println() 한줄 쓴다.
        try{
            // 절대경로, 상대경로.
            // 절대경로는 c:/ 로 시작하거나 / 로 시작하는 경로
            // 상대경로는 프로그램이 실행되는 곳을 기준.
            in = new BufferedReader(new FileReader("src/main/java/my/examples/ioexam/IOExam11.java"));
            out = new PrintWriter(new FileWriter("source.txt"));

            String line = null;
            int count = 1;
            while( (line = in.readLine()) != null){
                out.println(count + " : " + line);
                count++;
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{ in.close(); }catch(Exception ignore){}
            try{ out.close(); }catch(Exception ignore){}
        }
    }
}

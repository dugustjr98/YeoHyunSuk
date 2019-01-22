package my.examples.businesscard;

import java.net.URL;

public class UrlExam {
    public static void main(String[] args){
        try {
            URL url = new URL("http://www.naver.com");
        }catch(Exception ex){
            System.out.println(ex);
        }

    }
}

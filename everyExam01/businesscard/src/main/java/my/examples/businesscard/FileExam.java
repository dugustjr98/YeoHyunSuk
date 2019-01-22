package my.examples.businesscard;

import java.io.File;

public class FileExam {
    public static void main(String[] args){
        // 어떤 파일이 있느냐? 없느냐?

        File file = new File("/tmp/businesscard.json2");
        if(file.exists()){
            System.out.println("Ok!");
        }else{
            System.out.println("not found!");
        }
    }
}

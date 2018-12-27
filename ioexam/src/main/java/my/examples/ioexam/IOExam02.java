package my.examples.ioexam;

import java.io.File;

public class IOExam02 {
    public static void main(String[] args) {
        //4. IOExam02 를 만든다. PATH를 지정하면 폴더일 경우, 해당 폴더아래의 모든 파일과 폴더 정보를 출력하도록 한다. 재귀호출이 뭔지 보기
        File file = new File("/Users/yeohyeonseog/prject");

        if(file.exists()) {
            if (file.isFile()) {
                printFile(" ", file);
            } else {
                printDir(" ", file);
            }
        }
    }
    public static void printFile(String space,File file){
        System.out.println(space + file.getName());
    }
    public static void printDir(String space , File file){
        File[] files = file.listFiles();
        space = space + "  ";
        for(File f:files)
        {
            if(f.isFile()){
                printFile(space,f);
            }else{
                System.out.println(f.getName()+ "[DIR]");
                printDir(space,f);
            }
        }
    }
}

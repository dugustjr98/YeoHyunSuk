package my.examples.ioexam;

import java.io.File;

public class IOExam01 {
    public static void main(String[] args){
        // 폴더를 만들어주시고, 그 안에 몇가지 폴더를 만든다.
        // 그안에 몇가지 txt 파일을 복사한다.
        // 바탕화면에 fileio를 만들었다. /Users/urstory/Desktop/fileio
        //                         c:\\Users\\urstory\\Desktop\\fileio
        // 1. 위의 폴더가 있는지 없는지 검사한다. 있으면 있다. 없으면 없다고 출력
        // 2. 해당 경로가 파일인지, 폴더인지를 검사한다. 파일이면 파일, 폴더면 폴더로
        //    출력
        // 3. 해당 경로에 어떤 파일과 폴더들이 있는지 정보를 출력한다.
        // 4. IOExam02 를 만든다. PATH를 지정하면 폴더일 경우, 해당 폴더아래의 모든 파일과 폴더정보를 출력하도록 한다.

        File file = new File("/Users/urstory/Desktop");
        if(file.exists()){
            System.out.println("있어요.");
            if(file.isDirectory()){
                System.out.println("directory");
                File[] files = file.listFiles();
                for(File f: files){
                    System.out.println(f.getName() + "  " +
                        (f.isDirectory() ? "[DIR]" : "[FILE]") +
                            f.length()
                            );
                }
            }else if(file.isFile()){
                System.out.println("file");
            }else{
                System.out.println("-_-;");
            }
        }else{
            System.out.println("없어요.");
        }

    }
}

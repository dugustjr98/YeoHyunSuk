package my.examples.ioexam;

import java.io.File;

public class IOExam02 {
    public static void main(String[] args){
        File file = new File("/Users/urstory/Desktop");
        if(file.exists()){
            if(file.isFile()){
                printFile("", file);
            }else{
                printDir("", file);
            }
        }
    }

    public static void printFile(String space, File file){
        System.out.println(space + file.getName());
    }

    public static void printDir(String space, File file){
        System.out.println(space + file.getName() + "[DIR]");
        space = space + "  ";
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()){
                printFile(space, f);
            }else{
                printDir(space, f);
            }
        }
    }
}

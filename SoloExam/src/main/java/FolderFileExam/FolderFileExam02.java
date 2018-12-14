package FolderFileExam;

import java.util.ArrayList;
import java.util.List;

public class FolderFileExam02 {
    public static void main(String[] args) {

        Folder myfolder = new Folder("myf");
        Folder javafolder = new Folder("java");
        File file1 = new File("1번",500);
        File file2=new File("2번",700);

        List<Folder> list=new ArrayList<>();

        list.add(myfolder);
        list.add(javafolder);
        myfolder.add(file1);
        myfolder.add(file2);
        javafolder.add(file2);

        for(Folder folder:list)
        {
            System.out.println(folder.getLength());
        }
        myfolder.deleteFile("1번");

        for(Folder folder:list)
        {
            System.out.println(folder.getLength());
        }
    }
}

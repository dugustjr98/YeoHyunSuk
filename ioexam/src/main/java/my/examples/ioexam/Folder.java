package my.examples.ioexam;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {
    // 부모 클래스가 기본 생성자가 없다면 자식은, 반드시 부모의 생성자를 호출한다.
    private List<Node> list;// 노드의 자식에 파일이나 폴더를 가진다.
    public Folder(String parentFolder,String name){
        super(parentFolder,name);
        list = new ArrayList<>();
    }
    public void add(File file){
        list.add(file);
    }
    public void add(Folder folder){
        list.add(folder);
    }
    public List<File> getFiles(){
        List<File> fileList = new ArrayList<>();
        for(Node node :list){
            if(node instanceof File){      //File의 인스턴스냐.
                fileList.add((File)node);
            }
        }
        return fileList;
    }
    public List<Folder> getFolders(){
        List<Folder> folderList = new ArrayList<>();
        for(Node node :list){
            if(node instanceof Folder){      //Folder의 인스턴스냐.
                folderList.add((Folder)node);
            }
        }
        return folderList;

    }
}

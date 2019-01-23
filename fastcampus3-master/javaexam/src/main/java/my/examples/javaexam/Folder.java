package my.examples.javaexam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> folders;

    // 기본 생성자는 생성자가 하나 없을 경우에 자동으로 생성된다.
    // 기본 생성자가 아닐 경우엔 사용자가 직접 만들어준다.
    // 생성자는 메소드와 비슷하지만 return타입이 없고, 클래스명과 이름이 같다.
    // 생성자는 필드를 초기화하는 코드를 가지고 있다.
    public Folder(String name){
        this.name = name;
        files = new ArrayList<>();
        folders = new ArrayList<>();
    }

    public void rename(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public long getLength(){
        long length = 0;
        // foreach문이라고 해서 컬렉션에서 하나씩 꺼낸다.
        for(File file : files){
            length = length + file.getLength();
        }
        for(Folder folder : folders){
            length = length + folder.getLength();
        }
        return length; //TODO length는 계산되야한다.
    }

    // 메소드 오버로딩
    public void add(File file){
        files.add(file);
    }

    public void deleteFile(String fileName){
        Iterator<File> iterator = files.iterator();
        while(iterator.hasNext()){
            File file = iterator.next();
            if(file.getName().equals(fileName)){ // 값의 비교는 equals메소드 이용.
                iterator.remove();
                break; // while문을 빠져나간다.
            }
        }
    }

    // 토론꺼리. 왜 files 를 리턴하지 않고, files.iterator()를 리턴할까?
    public Iterator<File> fileIterator(){
        return files.iterator();
    }

    // 메소드 오버로딩 - 동일한 이름의 메소드가 여러개 있다.
    public void add(Folder folder){
        folders.add(folder);
    }

    public void deleteFolder(String folderName){
        Iterator<Folder> iterator = folders.iterator();
        while(iterator.hasNext()){
            Folder file = iterator.next();
            if(file.getName().equals(folderName)){
                iterator.remove();
                break; // while문을 빠져나간다.
            }
        }    }

    public Iterator<Folder> foderIterator(){
        return folders.iterator();
    }

}

// Folder folder = new Folder();
// 인스턴스 생성부터 필드에 값을 가지게 만드는 방법이 필요하다.
// 생성할 때 이름값을 넘겨줄 필요가 있다. 생성자를 이용.
// Folder folder = new Folder("영화");

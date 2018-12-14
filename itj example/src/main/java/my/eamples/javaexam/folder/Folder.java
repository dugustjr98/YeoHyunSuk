package my.eamples.javaexam.folder;
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Folder {
    private String name;
    //private long data;
    private int date;
    private List<Folder> folder ;
    private List<File> file;

    public Folder(String name){
        this.name = name;
        folder = new ArrayList<>();
        file = new ArrayList<>();
    }

public String getName(){
        return name;
}
    public long getData(){
        long data = 0;

        for(File file:file){
            data+=file.getData();
        }
        for(Folder folder:folder)
        {
            data+=folder.getData();
        }
        return data;
    }
    public void setDate(int date){
        this.date =date;
    }
    public int getDate(){
        return date;
    }
    public void add(Folder folder){
        this.folder.add(folder);
    }
    public void deleteFile(String name){
        Iterator<File> iterator=file.iterator();
        while(iterator.hasNext())
        { File file = iterator.next();
            if(file.getName().equals(name))
            {
                iterator.remove();

            }
            break;
        }
    }
    public void deleteFolder(String name){
        Iterator<Folder> iterator = folder.iterator();
        while(iterator.hasNext())
        { Folder folder = iterator.next();
            if(folder.getName().equals(name))
            {
                iterator.remove();

            }
            break;
        }

    }
    public void add(File file){
        this.file.add(file);
    }

    public Iterator<File> fileIterator(){
        return file.iterator();
    }
    public Iterator<Folder> folderIterator(){
        return folder.iterator();
    }

}

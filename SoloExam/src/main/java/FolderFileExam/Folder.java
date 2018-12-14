package FolderFileExam;

import java.util.*;

public class Folder {
   private String name;
   private List<File> files;
   private List<Folder> folders;

   public Folder(String name){
       this.name=name;
       files = new ArrayList<>();
       folders = new ArrayList<>();
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
    public void add(File file){
       files.add(file);
    }
    public void add(Folder folder){
       folders.add(folder);
    }
    public long getLength(){
       long length=0;
       for(File file:files)
       {
           length +=file.getData();
       }
       for(Folder folder:folders){
           length +=folder.getLength();
       }
       return length;
    }
    public void deleteFile(String name){
       Iterator<File> iterator = files.iterator();
       while(iterator.hasNext()){
           File file = iterator.next();
           if(file.getName().equals(name))
           {
               iterator.remove();
           }
       }
    }
    public void deleteFolder(String name){
       Iterator<Folder> iterator = folders.iterator();
       while(iterator.hasNext())
       {
           Folder folder = iterator.next();
           if(folder.getName().equals(name)){
               iterator.remove();
           }
       }
    }

}

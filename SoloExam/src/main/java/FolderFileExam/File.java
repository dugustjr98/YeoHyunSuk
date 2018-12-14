package FolderFileExam;

public class File {
 private String name;
 private long data;

 public File(String name,long data){
     this.name = name;
     this.data=data;
 }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }
}

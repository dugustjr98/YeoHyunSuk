package my.eamples.javaexam.folder;

public class File {
    private String name;
    private long data;
    private int date;

    public File(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setData(long data){
        this.data = data;
    }
    public long getData(){
        return data;
    }
    public void setDate(int date){
        this.date =date;
    }
    public int getDate(){
        return date;
    }

}

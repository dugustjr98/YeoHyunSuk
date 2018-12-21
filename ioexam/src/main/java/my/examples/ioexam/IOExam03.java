package my.examples.ioexam;

public class IOExam03 {
    public static void main(String[] args) {
        Folder folder = FileManager.scan("/Users/yeohyeonseog/IOEXAM");
        System.out.println(folder);
    }
}

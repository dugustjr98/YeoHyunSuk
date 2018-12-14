package my.eamples.javaexam.folder;

public class FFExam {
    public static void main(String[] args) {
    Folder folder = new Folder("mywork");
    Folder javafolder = new Folder("java");
    File file = new File("jqwe");
    File file1 = new File("vbf");

    folder.add(javafolder);
    folder.add(file);
    javafolder.add(file1);
    file.setData(1000);
    file1.setData(700);
    System.out.println(folder.getData()+"   "+javafolder.getData());

    folder.deleteFile("vbf");
    folder.deleteFolder("java");
        System.out.println(folder.getData()+"   "+javafolder.getData());
    }
}

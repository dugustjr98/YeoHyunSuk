package my.examples.javaexam;

public class FolderFileExam01 {
    public static void main(String[] args){
        Folder myworkFolder = new Folder("c:\\mywork");
        Folder javaFolder = new Folder("java");
        Folder docFolder = new Folder("doc");
        myworkFolder.add(javaFolder);
        myworkFolder.add(docFolder);

        File helloFile = new File("hello");
        helloFile.setLength(500);
        myworkFolder.add(helloFile);

        File java1TxtFile = new File("java1.txt");
        java1TxtFile.setLength(900);
        File java2TxtFile = new File("java2.txt");
        java2TxtFile.setLength(800);
        javaFolder.add(java1TxtFile);
        javaFolder.add(java2TxtFile);

        File readmeFile = new File("readme");
        readmeFile.setLength(700);
        docFolder.add(readmeFile);

        System.out.println(myworkFolder.getLength());
        System.out.println(javaFolder.getLength());
        System.out.println(docFolder.getLength());

        System.out.println("---------------------------");
        myworkFolder.deleteFile("hello");
        System.out.println(myworkFolder.getLength());
        myworkFolder.deleteFolder("java");
        System.out.println(myworkFolder.getLength());
    }
}

/*
c:\mywork\java\java1.txt  (900)
c:\mywork\java\java2.txt  (800)
c:\mywork\doc\readme.txt  (700)
c:\mywork\hello   (500)
 */
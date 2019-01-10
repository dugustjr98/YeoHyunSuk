package my.example.firstweb.webexample;

import java.time.LocalDateTime;

public class Board {
    private int id ;
    private String name;
    private String password;
    private String title;
    private String content;
    private LocalDateTime regdate;

    public Board(){
        regdate=LocalDateTime.now();
    }
    public Board(String name, String title, String content,int id){
        this();
        this.name = name;
        this.title = title;
        this.content = content;
        this.id=id;

    }
    public Board(String name, String password, String title, String content,int id){
        this(name, title, content,id);
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDateTime regdate) {
        this.regdate = regdate;
    }
}

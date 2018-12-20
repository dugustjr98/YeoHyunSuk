package FriendExam;

public class Friend {
    private String name;
    private String phone;

    public Friend(){}
    public Friend(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

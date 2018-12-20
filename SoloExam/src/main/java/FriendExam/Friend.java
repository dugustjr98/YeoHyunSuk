package FriendExam;

public class Friend {
    private String name;
    private String phone;

    // String 이 불변클래스라 불린다.


    public Friend(){}
    public Friend(String name){
        this.name = name;
    }
    public Friend(String name,String phone)
    {
        this.name = name;
        this.phone = phone;
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

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

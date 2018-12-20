package BusinessExam;

public class BusinessCard {
    private int id;
    private String name;
    private String phone;
    private String corporationName;

    public BusinessCard(){}
    public BusinessCard(String name,String phone,String corporationName){
        this.corporationName=corporationName;
        this.phone=phone;
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", corporationName='" + corporationName + '\'' +
                '}';
    }
}

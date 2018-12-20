package FriendExam;

public class StringExam {
    public static void main(String[] args) {
        String str = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";  //상수 풀이라는 곳에 들어간다 그래서 같은 값이면 같은것을 참조한다.

        String substring = str.substring(2);
        System.out.println(substring);
        System.out.println(str);
        if(str.equals(str2)){
            System.out.println("str equals str2");
        }
        if(str==str2){
            System.out.println("str == str2");
        }
        if(str.equals(str3)){
            System.out.println("str equals str3");
        }
        if(str == str3){
            System.out.println("str ==str3");
        }
        if(str3 == str4){
            System.out.println("str3==str4");
        }
    }
}

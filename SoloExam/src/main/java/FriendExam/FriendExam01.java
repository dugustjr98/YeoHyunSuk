package FriendExam;

public class FriendExam01 {
    public static void main(String[] args) {

        FriendManager friendManager = new FriendManager();
        Friend friend1 = new Friend("yeo","010-3782-1631");
        Friend friend2 = new Friend("kim","010-3586-9087");
        Friend friend3 = new Friend("lee","010-7829-3872");
        Friend friend4 = new Friend("man","010-3782-1631");

        friendManager.addFriend(friend1);
        friendManager.addFriend(friend2);
        friendManager.addFriend(friend3);
        friendManager.addFriend(friend4);
        friendManager.deleteFriend("010-3586-9087");
        System.out.println(friendManager.find());
        System.out.println(friendManager.friendNum());
        System.out.println(friendManager);

    }
}

package my.examples.businesscard;

import org.junit.Before;
import org.junit.Test;

public class FriendManagerTest {
    // test 할 객체를 선언
    FriendManager friendManager;

    @Before
    public void init(){
        friendManager = new FriendManager();
        Friend f1 = new Friend("홍길동");
        f1.setPhone("010-0000-0000");
        friendManager.add(f1);

        Friend f2 = new Friend("홍길동");
        f2.setPhone("010-0000-0000");
        friendManager.add(f2);

        Friend f3 = new Friend("도우너");
        f3.setPhone("010-0000-222");
        friendManager.add(f3);
    }

    @Test
    public void addFriend() throws Exception{
        int size = friendManager.count();
        Friend f = new Friend("마이콜");
        f.setPhone("010-0000-3333");
        friendManager.add(f);
        int size2 = friendManager.count();
        if(size2 == (size + 1)){
            System.out.println("성공");
        }else{
            System.out.println("-_-;");
        }
    }

    @Test
    public void deleteFriend() throws Exception{
        int deleteCount = friendManager.del("010-0000-0000");
        if(deleteCount == 2){
            System.out.println("성공!");
        }else{
            System.out.println("-_-;");
        }
    }
}

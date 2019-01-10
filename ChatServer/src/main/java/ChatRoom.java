import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatRoom {
    private List<ChatUser> chatUsers;
    private String title;

    public ChatRoom(ChatUser chatUser , String title){
        this.title = title;
        chatUsers = Collections.synchronizedList(new ArrayList<>());
        chatUsers.add(chatUser);

    }
    public boolean existsUsers(ChatUser chatUser){
        return chatUsers.contains(chatUser);
    }
    public void addChatUser(ChatUser chatUser){
        chatUsers.add(chatUser);
    }

    public void quitChatUser(ChatUser chatUser){
        chatUsers.remove(chatUser);
    }

    public List<ChatUser> getChatUsers() {
        return chatUsers;
    }

    public void setChatUsers(List<ChatUser> chatUsers) {
        this.chatUsers = chatUsers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
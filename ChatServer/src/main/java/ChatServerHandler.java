import java.net.Socket;
import java.util.List;

public class ChatServerHandler extends Thread {
    private Socket socket;
    private ChatHouse chatHouse;
    private boolean inRoom;

    public ChatServerHandler(Socket socket, ChatHouse chatHouse) {
        this.chatHouse = chatHouse;
        this.socket = socket;
        this.inRoom = false;
    }

    public void run() {
        ChatUser chatUser = new ChatUser(socket);
        String nickName = chatUser.read();
        chatUser.setNickName(nickName);
        System.out.println("Message : " + nickName);

        chatHouse.addChatUser(chatUser);

        try {
            while (true) {
                String message = chatUser.read();
                System.out.println("Message : " + message);
                if (!inRoom) {
                    if (message.indexOf("/create") == 0) {
                        String title = message.substring(message.indexOf(" ") + 1);
                        chatHouse.createRoom(chatUser, title);
                        inRoom = true;
                    } else if (message.indexOf("/list") == 0) {
                        List<ChatRoom> chatRooms = chatHouse.getChatRooms();
                        int i = 0;
                        for (ChatRoom cr : chatRooms) {
                            chatUser.write(i + " : " + cr.getTitle());
                            i++;
                        }

                    } else if (message.indexOf("/quit") == 0) {
                        chatHouse.exit(chatUser);

                    } else if (message.indexOf("/join") == 0) {
                        String strRoomNum = message.substring(message.indexOf(" ") + 1);
                        int roomNum = Integer.parseInt(strRoomNum);
                        chatHouse.joinRoom(roomNum, chatUser);
                        inRoom = true;
                    }
                } else { // 방안에 있을 경우
                    List<ChatUser> chatUsers = chatHouse.getUser(chatUser);
                    for (ChatUser cu : chatUsers) {
                        if(message.indexOf("/out") == 0){
                            chatUsers.remove(chatUser);
                            inRoom = false;
                            break;
                        }
                        cu.write(chatUser.getNickName() + " : " + message);
                    }
                }
            }
        } catch (Exception ex) {
            chatHouse.exit(chatUser);
        }
    }
}
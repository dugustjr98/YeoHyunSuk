import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClient {
    private String ip;
    private int port;

    public ChatClient(String ip,int port){
        this.ip = ip;
        this.port = port;
    }
    public void run(){
        Socket socket = null;
        ChatUser chatUser = null;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            socket = new Socket(ip,port);
            chatUser = new ChatUser(socket);

            System.out.println("닉네임을 입력하세요 : ");
            String nickName = br.readLine();
            chatUser.setNickName(nickName);
            chatUser.write(nickName);

            ChatClientHandler chatClientHandler = new ChatClientHandler(chatUser);
            chatClientHandler.start();

            while(true){
                String line = br.readLine();
                chatUser.write(line);
            }
        }catch(Exception ex){
            try{socket.close();}catch(Exception ignore){}
            try{br.close();}catch(Exception ignore){}
        }
    }
}
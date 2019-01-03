import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ConClient {
    private String ip;
    private int port;

    public ConClient(String ip, int port){
        this.ip = ip;
        this.port = port;
    }

    public void run(){
        Socket socket = null;
        ConUser conUser = null;
        BufferedReader br = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            socket = new Socket(ip, port);
            conUser = new ConUser(socket);

            System.out.println("닉네임을 입력하세요.");
            String nickName = br.readLine();
            conUser.setNickName(nickName);
            conUser.write(nickName);
            System.out.println(conUser.getNickName());


            ConClientHandler conClientHandler = new ConClientHandler(conUser);
            conClientHandler.start();

            while(true){
                String line = br.readLine();
                if(line.equals("/quit")){
                    System.exit(0);
                }
                conUser.write(line);
            }

        }catch(Exception ex){
            System.out.println("접속이 끊어졌습니다.");
        }finally{
            conUser.close();
        }
    }



}

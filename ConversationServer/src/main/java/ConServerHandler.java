
import java.net.Socket;
import java.util.List;

public class ConServerHandler extends Thread {
    private ConHouse conHouse;
    private Socket socket;
    private boolean inRoom;

    public ConServerHandler(Socket socket, ConHouse conHouse){
        this.conHouse = conHouse;
        this.socket=socket;
        inRoom = false;
    }

    @Override
    public void run() {
        ConUser conUser = new ConUser(socket);
        String nickname = conUser.read();
        conUser.setNickName(nickname);
        System.out.println("message : " + nickname);

        conHouse.addLobbyUser(conUser);
        try{
            while(true){
               String message = conUser.read();
                if(!inRoom){
                    switch (message){
                        case "/create":{
                            String roomName="";
                            conUser.write("방제목을 입력하세요 : ");
                            roomName = conUser.read();
                            conHouse.createRoom(conUser,roomName);

                            inRoom =true;
                            break;
                        }
                        case "/join":{
                            String strRoomNum="";
                            int roomNum=0;
                            conUser.write("입장할 방 번호를 입력하세요 : ");
                            strRoomNum = conUser.read();
                            roomNum = Integer.parseInt(strRoomNum);
                            conHouse.joinRoom(roomNum,conUser);
                            inRoom =true;
                            break;
                        }
                        case "/list":{
                            List<ConRoom> rooms = conHouse.getRooms();
                            int i=0;
                            for(ConRoom cr:rooms){
                                conUser.write(i+" : "+cr.getTitle());
                                i++;
                            }
                            break;
                        }
                        case "/delete":{
                            List<ConRoom> rooms = conHouse.getRooms();

                            int i=0;
                            for(ConRoom cr:rooms){
                                conUser.write(i+" : "+cr.getTitle());
                                i++;
                            }
                            conUser.write("폭파시킬 방 번호를 입력하세요 : ");
                            String strRoomNum="";
                            int roomNum = 0;
                            strRoomNum = conUser.read();
                            roomNum = Integer.parseInt(strRoomNum);

                            if(rooms.get(roomNum).getRoom().size() == 0){
                                rooms.remove(roomNum);
                            }else{
                                conUser.write("방에 사람이 있습니다.");
                            }

                            break;

                        }
                    }

                }else{//방안에 있을 때
                    List<ConUser> conUsers = conHouse.getUser(conUser);
                    for(ConUser cu:conUsers){
                        if(message.equals("/out")){
                            conUsers.remove(conUser);
                            inRoom = false;
                            break;
                        }
                        cu.write(conUser.getNickName()+" : "+message);
                    }
                }
            }

        }catch(Exception ex){
        conHouse.exit(conUser);
        }
    }
}

package my.examples.chatingprogram;

public class ChatServerMain {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer(9909);
        chatServer.run();
    }
}

package my.examples.chatingprogram;

public class ChatClientMain2 {
    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient("127.0.0.1",9909);
        chatClient.run();
    }
}


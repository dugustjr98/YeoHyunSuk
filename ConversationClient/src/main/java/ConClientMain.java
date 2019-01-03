public class ConClientMain {
    public static void main(String[] args) {
        ConClient conClient = new ConClient("127.0.0.1", 9999);
        conClient.run();
    }
}

public class ConClientHandler extends Thread{
    private ConUser conUser;
    public ConClientHandler(ConUser conUser){
        this.conUser = conUser;
    }

    public void run(){
        while(true){
            String line = conUser.read();
            System.out.println(line);
        }
    }
}

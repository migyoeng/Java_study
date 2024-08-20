package poly.ex;

public class SendMain {

    public static void main(String[] args) {
        Sender[] Senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : Senders) {
            sender.sendMessage("환영합니다!");
        }
    }//main end
}

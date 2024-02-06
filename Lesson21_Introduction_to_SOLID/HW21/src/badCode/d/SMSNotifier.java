package badCode.d;

public class SMSNotifier implements Notifier {
    @Override
    public void send(String recipient, String message) {

        System.out.println(message); // отправить SMS уведомление
    }

}

package badCode.d;

public class EmailNotifier implements Notifier {
   @Override
    public void send(String recipient, String message) {
        System.out.println(message); // отправить email уведомление
    }
}
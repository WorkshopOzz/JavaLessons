

import badCode.d.EmailNotifier;
import badCode.d.Notifier;
import badCode.d.SMSNotifier;

public class Main {
    public static void main(String[] args) {
       Notifier sms = new SMSNotifier();
       sms.send("Bill","Hello word.");
    }
}

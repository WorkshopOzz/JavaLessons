import java.util.Scanner;

public class Phone {
    static String phoneManufacturerCountry = "China";
    long phoneNumber;
    String phoneModel;
    double phoneWeigth;


    public Phone() {
    }

    public Phone(long phoneNumber, String phoneModel, double phoneWeigth) {
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneWeigth = phoneWeigth;
    }

    public void phoneInfo(){
        System.out.println(phoneModel + "\n" + phoneNumber + "\n" + phoneWeigth);
    }
     public void receiveCall(String callName) {
        receiveCall(callName, 0 );
    }

    public void receiveCall(String callName, long callNumber) {
        System.out.println(" Enter  the caller's name");
        callName = new Scanner(System.in).next();
        System.out.println(" Enter  the caller's number");
        callNumber = new Scanner(System.in).nextLong();
        System.out.println("Вам звонит\n"  + callName + "\n" + "-----------\n"  + (callNumber == 0 ? "" : callNumber));
    }

}

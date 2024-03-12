import java.util.Set;
import java.util.TreeSet;

public class PhoneList {
        private String name;
        private Set<String> phoneNumbersSet = new TreeSet<>();

   void add(String phonenumber){
       phoneNumbersSet.add(phonenumber);
   }
   void print(){
       for (String phoneNumbers : phoneNumbersSet) {
           System.out.println(phoneNumbers);
       }
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getPhoneNumbersSet() {
        return phoneNumbersSet;
    }

    public void setPhoneNumbersSet(Set<String> phoneNumbersSet) {
        this.phoneNumbersSet = phoneNumbersSet;
    }

    public PhoneList(String name) {
        this.name = name;
    }
}


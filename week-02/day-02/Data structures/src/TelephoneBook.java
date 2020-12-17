//We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.
//
//        Create a map with the following key-value pairs.
//
//        Name (key)	Phone number (value)
//        William A. Lathan	405-709-1865
//        John K. Miller	402-247-8568
//        Hortensia E. Foster	606-481-6467
//        Amanda D. Newland	319-243-5613
//        Brooke P. Askew	307-687-2982
//        Create an application which solves the following problems.
//
//        What is John K. Miller's phone number?
//        Whose phone number is 307-687-2982?
//        Do we know Chris E. Myers' phone number?

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String,String> phoneBook = new HashMap<>();
        phoneBook.put("William A. Lathan","405-709-1865");
        phoneBook.put("John K. Miller","402-247-8568");
        phoneBook.put("Hortensia E. Foster","606-481-6467");
        phoneBook.put("Amanda D. Newland","319-243-5613");
        phoneBook.put("Brooke P. Askew","307-687-2982");


        System.out.println(phoneBook.get("John K. Miller"));
       for (Map.Entry<String,String> entry : phoneBook.entrySet()) {
           if (entry.getValue().equals("307-687-2982")) {
               System.out.println(entry.getKey());
           }
       }
        System.out.println(phoneBook.containsKey("Chris E. Myers"));
    }

}

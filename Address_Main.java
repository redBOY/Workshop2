package main.main.Workshop2;
import java.util.HashMap;
import java.util.Map;

public class Address_Main {

        static String addressbookName = "fistAddress";
        public static void main(String[] args) {
            Map<String, Address> addressMap = new HashMap<>();
            Address firstaddress = new Address();
            firstaddress.add_contacts();
            System.out.println(firstaddress.contactList);
            Address secondAddress= new Address();
            secondAddress.add_contacts();
            System.out.println(secondAddress.contactList);
            addressMap.put(addressbookName,firstaddress);

        }
    }



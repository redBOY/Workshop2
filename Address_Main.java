package main.main.Workshop2;
import java.util.HashMap;
import java.util.Map;

public class Address_Main {

        static String addressbookName = "fistAddress";
        public static void main(String[] args) {
            Map<String, Address> addressMap = new HashMap<>();
            Address firstaddressbook = new Address_Book();
            firstaddress.add_contacts();
            System.out.println(firstaddress.contactList);
            Address secondAddressbook= new Address();
            secondAddressbook.add_contacts();
            System.out.println(secondAddressbook.contactList);
            addressMap.put(addressbookName,firstaddressbook);

        }
    }



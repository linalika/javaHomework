package homework4;

import java.util.*;

public class PhoneBook {
    private Map<String, HashSet<String>> phoneBook  = new HashMap<>();

    public PhoneBook(Map<String, HashSet<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public PhoneBook() {

    }

    public void add(String name, String number){
        HashSet<String> numbers;
        if (phoneBook!=null && phoneBook.containsKey(name)) {
            numbers = phoneBook.get(name);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(number);
        phoneBook.put(name,numbers);
    }
    public  Set<String> get(String lastName) {
        return phoneBook.get(lastName);
    }
}

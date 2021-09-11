package homework4;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("alina","120394i32");
        phoneBook.add("alina","9388213");
        phoneBook.add("zina","1231");
        System.out.println(phoneBook.get("alina"));

    }
}


public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Kirill", "89629248553");
        phoneBook.add("Andrey", "89629248552");
        phoneBook.add("Zoiya", "89629248551");

        System.out.println("По имени Kirill, найден(а) телефон " +phoneBook.findByName("Kirill"));
        System.out.println("По номеру 89629248551, найден(а) контакт " + phoneBook.findByNumber("89629248551"));
        phoneBook.printAllNames();

    }
}
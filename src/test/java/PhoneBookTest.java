import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PhoneBookTest {

    @Test
    public void add() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Kirill", "89629248553");
        Assertions.assertTrue(phoneBook.contacts.containsKey("Kirill") && phoneBook.contacts.containsValue("89629248553"));
    }

    @Test
    public void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Kirill", "89629248553");
        Assertions.assertEquals("Kirill", phoneBook.findByNumber("89629248553").toString());
    }

    @Test
    public void findByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Kirill", "89629248553");
        Assertions.assertEquals("89629248553", phoneBook.findByName("Kirill").toString());
    }

    @Test
    public void printAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Kirill", "89629248553");
        phoneBook.add("Andrey", "89629248552");
        phoneBook.add("Zoiya", "89629248551");
        Assertions.assertEquals("Andrey", phoneBook.names.getFirst());

    }

}

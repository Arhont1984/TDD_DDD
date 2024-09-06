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

}

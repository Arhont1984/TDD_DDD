import java.util.HashMap;
import java.util.TreeSet;

public class PhoneBook {

    // Хранение имен и номеров телефонов
    HashMap<String, String> contacts = new HashMap<>();
    // Хранение имен в алфавитном порядке
    TreeSet<String> names = new TreeSet<>();


    public int add(String name, String number) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, number);
            names.add(name);
        }
        return contacts.size(); // Возвращаем количество контактов
    }

    //метод для поиска по номеру
    public Object findByNumber(String number) {
        for (var entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null; // Если номер не найден
    }

    //Метод для поиска по имени
    public String findByName(String name) {
        return null;
    }

}

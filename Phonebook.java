package Lesson_5;
import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        TelephoneDirectory directory = new TelephoneDirectory();
        directory.addEntry("Иванов", "+375297116333");
        directory.addEntry("Петров", "+375297116333");
        directory.addEntry("Иванов", "+375297147633");

        directory.displayEntry("Иванов");
        System.out.println();
        directory.displayAll();
    }


    public static class TelephoneDirectory {

        private Map<String, List<String>> directory;

        public TelephoneDirectory() {
            directory = new HashMap<>();
        }


        public void addEntry(String surname, String phoneNumber) {
            if (!directory.containsKey(surname)) {
                directory.put(surname, new ArrayList<>());
            }
            directory.get(surname).add(phoneNumber);
        }


        public List<String> getPhoneNumbers(String surname) {
            return directory.getOrDefault(surname, new ArrayList<>());
        }

        public void displayEntry(String surname) {
            List<String> phoneNumbers = getPhoneNumbers(surname);
            if (phoneNumbers.isEmpty()) {
                System.out.println("Записей для " + surname + " не найдено.");
            } else {
                System.out.println(surname + ": " + phoneNumbers);
            }
        }




        public void displayAll() {
            for (Map.Entry<String, List<String>> entry : directory.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        }
    }

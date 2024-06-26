package Lesson_4;

public class MyArray {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array = {{"1", "2", "3", "4"},
                {"s", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try {
            CountArray.processArray(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}



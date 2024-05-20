import java.util.Arrays;

public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords(); // Задание 1
        checkSumSign(0, 1); // Задание 2
        printColor(55); // Задание 3
        compareNumbers(1, 1); // Задание 4
        comparisonOfNumbers(10, 20); // Задание 5
        integer(-2); // Задание 6
        trueOrFalseInteger(7); // Задание 7
        numberAndString( "Hello! "); // Задание 8
        whatYear(2025); // Задание 9
        changeArr(); // Задание 10
        arrNumb(); // Задание 11
        arrSix(); // Задание 12
        squareArr(); // Задание 13
        lenInitialValue(5, 3); // Задание 14
    }

    static void printThreeWords(){
        System.out.print("Задание 1:"+ "\n" );
        System.out.println("Orange"+ "\n" + "Banana"+ "\n" + "Apple"+ "\n");
    }

    static void checkSumSign(int a, int b){
        System.out.print("Задание 2: " );
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная"+ "\n");
        } else if (c <= 0) {
            System.out.println("Сумма отрицательная"+ "\n");
        }
    }

    static void printColor(int colar){
        System.out.print("Задание 3: " );
        if (colar <= 0) {
            System.out.println("Красный"+ "\n");
        } else if (colar > 0 && colar <= 100) {
            System.out.println("Желтый̆"+ "\n");
        } else if (colar > 100) {
            System.out.println("Зеленый" + "\n");
        }
    }

    static void compareNumbers(int a, int b){
        System.out.print("Задание 4: " );
        if (a >= b){
            System.out.println("a >= b"+ "\n");
        } else {
            System.out.println("a < b"+ "\n");
        }
    }

    static void comparisonOfNumbers(int a, int b){
        System.out.print("Задание 5: " );
        int c = a + b;
        if (c >= 10 && c <= 20){
            System.out.println("true"+ "\n");
        } else {
            System.out.println("false"+ "\n");
        }
    }

    static void integer(int a){
        System.out.print("Задание 6: " );
        if (a >= 0) {
            System.out.println("Положительное"+ "\n");
        } else {
            System.out.println("Отрицательное"+ "\n");
        }
    }

    static void trueOrFalseInteger(int a) {
        System.out.print("Задание 7: " );
        if (a <= 0){
            System.out.println("true"+ "\n");
        } else {
            System.out.println("false"+ "\n");
        }
    }

    static void numberAndString(String b){
        System.out.print("Задание 8: " );
        String repeated = b.repeat(3);
        System.out.println(repeated + "\n");
    }

    static void whatYear(int a){
        System.out.print("Задание 9: " );
        if (a % 4 == 0) {
            if ((a % 100 != 0) || (a % 400 == 0))
                System.out.println("true"+ "\n");
        } else {
            System.out.println("false"+ "\n");
        }
    }

    static void changeArr(){
        System.out.print("Задание 10: " );
        int[] arr = new int[] {1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]++;
            } else {
                arr[i]--;
            }
        }
        System.out.println(Arrays.toString(arr)+ "\n");
    }


    static void arrNumb(){
        System.out.print("Задание 11: " );
        int[] array = new int[100];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value += 1;
            System.out.print(array[i]+", ");
        }
        System.out.println("\n");
    }

    static void arrSix(){
        System.out.print("Задание 12: " );
        int[] arr1 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 6) {
                arr1[i] *=  2;
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");
    }

    static void squareArr(){
        System.out.print("Задание 13: "+"\n" );
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0, x = arr2[i].length - 1; j < arr2[i].length; j++, x--) {
                if (i == j || i == x) {
                    arr2[i][j] = 1;
                } else arr2[i][j] = 0;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    static void lenInitialValue(int len, int initialValue){
        System.out.print("Задание 14: " );
        int[] arr3 = new int[len];
        for (int i = 0; i < len; i++) {
            arr3[i] = initialValue;
            System.out.print(arr3[i] + " ");
        }
    }

}


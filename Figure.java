package Lesson_3;

interface Figure {
    double calculatePerimeter();
    double calculateArea();
    String getFigureName();
    default void displayPerimeter() {
        System.out.println("Периметр "+ getFigureName() + calculatePerimeter());
    }
    default void displayArea() {
        System.out.println("Площадь  " + getFigureName() + calculateArea());
    }


}






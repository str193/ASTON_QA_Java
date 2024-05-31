package Lesson_3;

public class Lesson_3_Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(3, 4, 5);


        FigureColor circle1 = new FigureColor("красный","черный");
        FigureColor rectangle1 = new FigureColor("желтый","зеленый");
        FigureColor triangle1 = new FigureColor("синий","розовый");

        System.out.println("Периметр круга: " + circle.calculatePerimeter());
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Цвет заливки - " + circle1.getFillColor() + ", Цвет границы - " + circle1.getBorderColor()+ "\n");

        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Цвет заливки - " + rectangle1.getFillColor() + ", Цвет границы - " + rectangle1.getBorderColor()+ "\n");

        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Цвет заливки - " + triangle1.getFillColor() + ", Цвет границы - " + triangle1.getBorderColor()+ "\n");

        //Дополнительно
        Figure circle2 = new Circle(5);
        circle2.displayPerimeter();
        circle2.displayArea();
        Figure rectangle2 = new Rectangle(3, 4);
        rectangle2.displayPerimeter();
        rectangle2.displayArea();
        Figure triangle2 = new Triangle(3, 4, 5);
        triangle2.displayPerimeter();
        triangle2.displayArea();
    }

}


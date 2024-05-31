package Lesson_3;

public class Lesson_3_Task1 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Мурзик");
        cat.addFoodToBowl(2); // добавляем еду
        System.out.println("");

        dog.animalRun(200);
        dog.animalSwim(5);

        cat.animalRun(150);
        cat.animalSwim(20);
        System.out.println("");


        cat.eatFromBowl(cat);
        System.out.println("");

        System.out.println("Количество созданных животных: " + Animal.getAnimalCount());
        System.out.println("Количество созданных котов: " + Cat.getCatCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount() + "\n");


        Cat.bowl.setFoodAmount(2);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Матроскин");
        cats[2] = new Cat("Васька");

        for (Cat currentCat : cats) {
            currentCat.eatFromBowl(currentCat);
        }
    }
}
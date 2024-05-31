package Lesson_3;

public class Animal {
    private static int animalCount = 0;
    String name;


    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public void animalRun(int distance) {
        System.out.println("Животное " + name + " бежит"+ distance + " м.");
    }

    public void animalSwim(int distance) {
        System.out.println("Животное " + name + " плывет"+ distance + " м.");
    }
}

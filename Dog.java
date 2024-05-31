package Lesson_3;

public class  Dog extends Animal {
    private static int dogCount = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public void animalRun(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Собака " + name + " бежит " + distance + " м.");
        } else {
            System.out.println("Собака " + name + " не может пробежать больше " + maxRunDistance + " м.");
        }
    }

    public void animalSwim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Собака " + name + " плывет " + distance + " м.");
        } else {
            System.out.println("Собака " + name + " не может проплыть больше " + maxSwimDistance + " м.");
        }
    }
}

package Lesson_3;

public class Cat extends Animal {
    private int hungerLevel;
    private static int catCount = 0;
    private final int maxRunDistance = 200;
    private boolean isFull = false;
    static Bowl bowl = new Bowl();

    public Cat(String name) {
        super(name);
        this.hungerLevel = 0;
        catCount++;
    }

    public int getHunger() {
        return hungerLevel;
    }

    public void setFull(boolean full) {
        this.isFull = full;
    }

    public void addFoodToBowl(int amount) {
        bowl.setFoodAmount(bowl.getFoodAmount() + amount);
        System.out.println("Добавлено " + amount + " еды в миску. Теперь в миске " + bowl.getFoodAmount() + " еды.");
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eatFromBowl(Cat cat) {
        if (1 <= Cat.bowl.getFoodAmount()) {
            System.out.print("Кот " + getName() + " поел из миски.");
            Cat.bowl.setFoodAmount(Cat.bowl.getFoodAmount() - 1);
            System.out.println(" В миске осталось " + Cat.bowl.getFoodAmount() + " еды.");
            isFull = true;
            hungerLevel = 0;
            System.out.println("Кот сытый");
        } else {
            System.out.println("В миске недостаточно еды! ");
            isFull = false;
            hungerLevel++;
            System.out.println("Кот " + getName() + " голодный.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public void animalRun(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кот " + getName() + " бежит " + distance + " м.");
        } else {
            System.out.println("Кот " + getName() + " не может пробежать больше " + maxRunDistance + " м.");
        }
    }

    public void animalSwim(int distance) {
        System.out.println("Кот " + getName() + " не умеет плавать!");
    }

    public static class Bowl {
        private int foodAmount;

        public Bowl() {
            this.foodAmount = 0;
        }

        public int getFoodAmount() {
            return foodAmount;
        }

        public void setFoodAmount(int foodAmount) {
            this.foodAmount = foodAmount;
        }
    }
}
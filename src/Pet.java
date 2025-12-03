public class Pet {
    private String name;
    private int hunger;
    private int energy;
    private int mood;

    public Pet(String name) {
        this.name = name;
        this.hunger = 30;
        this.energy = 70;
        this.mood = 60;
    }

    public void printStatus() {
        System.out.println("\n-----------------------------");
        System.out.println("Имя: " + name);
        System.out.println("Голод: " + hunger);
        System.out.println("Энергия: " + energy);
        System.out.println("Настроение: " + mood);
        System.out.println("-----------------------------");
    }

    public void feed() {
        hunger -= 20;
        mood += 5;
        normalize();
        System.out.println(name + " поел 🍗");
    }

    public void play() {
        mood += 20;
        hunger += 10;
        energy -= 15;
        normalize();
        System.out.println(name + " поиграл 🎾");
    }

    public void sleep() {
        energy += 25;
        hunger += 10;
        normalize();
        System.out.println(name + " поспал 😴");
    }

    public void doNothing() {
        hunger += 5;
        mood -= 5;
        normalize();
        System.out.println(name + " ничего не делал...");
    }

    public void tick() {
        hunger += 3;
        mood -= 2;
        energy -= 1;
        normalize();
    }

    private void normalize() {
        hunger = Math.max(0, Math.min(100, hunger));
        energy = Math.max(0, Math.min(100, energy));
        mood = Math.max(0, Math.min(100, mood));
    }

    public boolean isAlive() {
        return hunger < 100 && energy > 0 && mood > 0;
    }
}
import java.util.Scanner;

public class Game {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя питомца: ");
        String name = scanner.nextLine();

        Pet pet = new Pet(name);
        System.out.println("Ваш питомец создан!");

        while (pet.isAlive()) {
            pet.printStatus();

            System.out.println("Выберите действие:");
            System.out.println("1-Покормить");
            System.out.println("2-Поиграть");
            System.out.println("3-Уложить спать");
            System.out.println("4-Ничего не делать");
            System.out.println("5-Выход");
            System.out.println("6-Помыть питомца");

            System.out.print(">>> ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    pet.feed();
                    break;
                case "2":
                    pet.play();
                    break;
                case "3":
                    pet.sleep();
                    break;
                case "4":
                    pet.doNothing();
                    break;
                case "6":
                    pet.wash();
                    break;
                case "5":
                    System.out.println("Вы вышли из игры.");
                    return;
                default:
                    System.out.println("Неверный ввод! Попробуйте ещё.");
                    continue;
            }

        
            pet.tick();
        }

        System.out.println("⚠️ Ваш питомец умер...");
        System.out.println("Игра окончена.");
    }
}

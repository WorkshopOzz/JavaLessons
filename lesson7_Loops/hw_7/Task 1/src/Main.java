import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        int countElixir = 0;
        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("-----Welcome to the alchemy laboratory!-----");
        System.out.println("To create potions you need the following ingredients (enter the quantity available to you): ");
        System.out.println("Toad eyes = ");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Ghoul Tears = ");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Raven Bones = ");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Dumplings = ");
        dumplingsCount = new Scanner(System.in).nextInt();
        System.out.println("Your inventory: ");
        System.out.println("__________________");
        System.out.println("| Toad eyes = " + toadEyesCount + "  |");
        System.out.println("| Ghoul Tears = " + ghoulTearsCount + "|");
        System.out.println("| Raven Bones = " + ravenBonesCount + "|");
        System.out.println("| Dumplings = " + dumplingsCount + "  |");
        System.out.println("__________________");
        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("You can create Elixir of Vigilance");
            countElixir++;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("You can create Elixir of Fortitude");
            countElixir++;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("You can create Elixir of Stealth");
            countElixir++;
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("You can create: Forbidden Elixir");
            countElixir++;
        }
        if (countElixir == 0) {
            System.out.println("You can't create any elixir. Plz, start getting ingredient!");
        }


        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
    }
}

import java.util.Scanner;

public class Main {
    static String booksInfo = "";

    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double bookCost = inputBookCost();
            addBook(name, pageCount, bookCost);
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }
    public static double inputBookCost() {
        System.out.println("Введите цену:");
        return new Scanner(System.in).nextDouble();
    }
     public static void addBook(String bookName, int pageCount, double bookCost) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр." + " - " + (bookCost > 0 ? bookCost : "N/A")+ " rub.\n";
    }

        public static void printInfo() {
        System.out.println(booksInfo);
    }

}

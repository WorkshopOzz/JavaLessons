import java.util.Scanner;

public class Library_example {
    static String booksInfo = "";

    public static void main(String[] args) {
      while (true) {
          String name = inputBookName();
         int pageCount = inputPageCount();
          addBook(name, pageCount);
          printInfo();
      }


    }

    public static String inputBookName() {
        System.out.println("Enter book name");
        return new Scanner(System.in).nextLine();
    }

//    public static void addBook(String bookName) {
//        booksInfo = booksInfo + bookName + "\n";
//    }
public static void addBook(String bookName) {
       addBook( bookName, 0);
    }
public static int inputPageCount(){
    System.out.println("Enter the number of pages");
    return new Scanner(System.in).nextInt();
}
    public static void addBook(String bookName, int pageCount){
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " page\n";
    }
    public static void printInfo() {
        System.out.println(booksInfo);
    }
}

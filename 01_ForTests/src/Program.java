public class Program{

    public static void main(String[] args) {

        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s \n", b1.name, b1.getType());
    }
}
class Book{

    private Type bookType;
    String name;
    String author;

    Book(String name, String author, Type type){

        this.bookType = type;
        this.name = name;
        this.author = author;
    }
    String getType(){
        switch(bookType){
            case BELLETRE: return "Belletre";
            case SCIENCE: return "Science";
            case SCIENCE_FICTION: return "Science fiction";
            case PHANTASY: return "Phantasy";
            default: return "Undefined";
        }
    }
}

enum Type{

    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}
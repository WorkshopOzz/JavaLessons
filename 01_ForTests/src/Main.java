public class Main {
    public static void main(String[] args) {
        errorType(Command.LIST);



    }

    private static void errorType(Command command) {
        switch (command){
            case EXIT -> System.out.println("Exit");
            case LIST -> System.out.println("List");
            case TEST -> System.out.println("Test");

        }
    }


}




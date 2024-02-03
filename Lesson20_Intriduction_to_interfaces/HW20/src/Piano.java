public class Piano implements Musician {
    public void play(){
        System.out.println("пам-пам-пам-вжунь");
    }

    @Override
    public void perfom() {
play();
    }
}

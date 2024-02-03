public class Flute implements Musician{
    public void play(){
        System.out.println("тюри-тюри-трюю");
    }

    @Override
    public void perfom() {
play();
    }
}

public class Guitar implements Musician {
    public void play(){
        System.out.println("трынь-брынь-брынь-трынь");
    }

    @Override
    public void perfom() {
play();
    }
}

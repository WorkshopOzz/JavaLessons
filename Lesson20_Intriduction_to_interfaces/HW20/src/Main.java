public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Guitar guitar = new Guitar();
        Flute flute = new Flute();
        Musician musician = new Musician();
        musician.perform(guitar);
        musician.perform(piano);
    }
}

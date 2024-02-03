public class Main {
//    Интерфейс
public static void main(String[] args) {
    RemoteController controller = new RemoteController();
    Fen fen = new Fen();
    Lamp lamp = new Lamp();
    Tv tv = new Tv();
    controller.powerOn(fen);
    controller.powerOn(lamp);
    controller.powerOn(tv);
    Mover mover = new Mover();
    mover.moveObject(fen);
    mover.moveObject(lamp); // tv не сможем использовать

}
}

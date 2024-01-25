//модификатор public - будут доступны из любой точки нашего кода
//модификатор protected - будут видны в пределах всех класс находящихся в том же пакете (папка), что и наш и в пределах всех всех класов наследников нашего класса
//модификатор package or default (когда перед переменой  ничего не пишем)  -  доступны для класса в котором мы их создаем и в пакете в котором находится
//модификатор private - будт доступны только в пределах класса.
public class Main {
    public static void main(String[] args) {
Robot robot = new Robot();
robot.setX(3);
robot.setY(2);
robot.move(0,5);
        System.out.println("Next move");
        robot.move(5,10);
        System.out.println(robot.getX() + " " + robot.getY());
    }
}
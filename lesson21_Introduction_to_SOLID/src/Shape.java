public abstract class Shape {
   abstract void draw();

}
// Мы сделали класс абстрактным для того чтобы неожидать от него определенного поведения.
// Иметь возможность менять реализацию методов класса. У каждого класса будет метод, но реализация будет по разному.
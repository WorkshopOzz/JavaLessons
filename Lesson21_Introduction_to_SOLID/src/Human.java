public class Human {
    private double weight;
    private double height;

    public Human() {
    }

    public Human(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
// Наличие обоих конструкторов класс - удовлетворяет принципу OCP. При добавление в конструктр класса переменых, мы оставили возможность работы старого кода
}

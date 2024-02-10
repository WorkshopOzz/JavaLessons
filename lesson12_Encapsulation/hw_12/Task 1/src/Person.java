public class Person {
/*2. Создайте POJO класс Person в пакете src. В классе будет 5 полей:
1. Имя
2. Должность
3. Место работы
4. Возраст
5. Зарплата
    Сделайте конструктор со всеми параметрами и без параметров.
    Сделайте геттеры и сеттеры на все поля.
    Сделайте максимально закрытые поля класса*/
private String name;
private String title;
private String company;
private int age;
private double salary;

public Person(){

}

    public Person(String name, String title, String company, int age, double salary) {
        this.name = name;
        this.title = title;
        this.company = company;
        this.age = age;
        this.salary = salary;
    }
//public void getInfo(){
//        System.out.println("Name: " + getName() + ";\n" + "Title job: " + getTitle() + ";\n" + "Company: " + getCompany() + ";\n" + "Age: " + getAge() + ";\n" + "Salary: " + getSalary() + ";\n");
//}
    public void getInfo(){
        System.out.println("Name: " + name + ";\n" + "Title job: " + title + ";\n" + "Company: " + company + ";\n" + "Age: " + age + ";\n" + "Salary: " + salary + ";\n");
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

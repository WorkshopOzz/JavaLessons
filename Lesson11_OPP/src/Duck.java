public class Duck {
String name;
int age;
static int footCount;
String color;

    public Duck(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void fly(){
        System.out.println(color + " утка по кличке " + name + " улетела в теплые края" + footCount + "лапами");
            }
            static void fly(int footCount){
        Duck.footCount = footCount;
            }
}


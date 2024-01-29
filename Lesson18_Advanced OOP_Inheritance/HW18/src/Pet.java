public class Pet {
    private Double weight;
    private Integer age;
    private String name;
public  void walk(){
    System.out.println("Животное идет по земле");
}

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(Double weight, Integer age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public Pet() {
    }
}

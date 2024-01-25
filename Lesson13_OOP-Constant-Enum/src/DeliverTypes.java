public enum DeliverTypes {
 AERO("Авиа доставка стоит 1000 р."),
    STEP("Пешая доставка стоит 100р"),
    AUTO("Авто доставка стоит 200 р."),
    WATER("Доставка по воде стоит 500 р.");
 private String value;

    DeliverTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

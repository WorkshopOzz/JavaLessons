public enum TypeError {
    PHONE_NUMBER("Неверный формат ввода номера телефона"),
    NAME("Неверный формат ввода имени абонента"),
    GENERAL("Неверный формат ввода");
    private String value;

    TypeError(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

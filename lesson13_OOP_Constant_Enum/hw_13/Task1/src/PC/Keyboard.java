package PC;

import PC.Enums.Backlight;
import PC.Enums.TypeKeyboard;

public class Keyboard {
    TypeKeyboard typeKeyboard;
    Backlight backlight;
    private double weightKeyboard;

    public Keyboard() {
    }

    public Keyboard(TypeKeyboard typeKeyboard, Backlight backlight, double weightKeyboard) {
        this.typeKeyboard = typeKeyboard;
        this.backlight = backlight;
        this.weightKeyboard = weightKeyboard;
    }

    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public void setTypeKeyboard(TypeKeyboard typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }

    public Backlight getBacklight() {
        return backlight;
    }

    public void setBacklight(Backlight backlight) {
        this.backlight = backlight;
    }

    public double getWeightKeyboard() {
        return weightKeyboard;
    }

    public void setWeightKeyboard(double weightKeyboard) {
        this.weightKeyboard = weightKeyboard;
    }

    @Override
    public String toString() {
        return "typeKeyboard = " + typeKeyboard +
                " , backlight = " + backlight +
                ", weightKeyboard = " + weightKeyboard + '}';
    }
}

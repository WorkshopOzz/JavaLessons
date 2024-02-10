package PC;

import PC.Enums.TypeMatrix;

public class Screen {
    double diagonal;
    TypeMatrix typeMatrix;
   private double weight_screen;

    public Screen() {
    }

    public Screen(double diagonal, TypeMatrix typeMatrix, double weight_screen) {
        this.diagonal = diagonal;
        this.typeMatrix = typeMatrix;
        this.weight_screen = weight_screen;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public TypeMatrix getTypeMatrix() {
        return typeMatrix;
    }

    public void setTypeMatrix(TypeMatrix typeMatrix) {
        this.typeMatrix = typeMatrix;
    }

    public double getWeight_screen() {
        return weight_screen;
    }

    public void setWeight_screen(double weight_screen) {
        this.weight_screen = weight_screen;
    }

    @Override
    public String toString() {
        return "diagonal = " + diagonal +
                ", typeMatrix = " + typeMatrix +
                ", weight_screen = " + weight_screen + '}';
    }
}

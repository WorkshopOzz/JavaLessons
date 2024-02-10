package PC;

import PC.Enums.TypeOperationMemory;

public class OperationMemory {
    TypeOperationMemory typeOperationMemory;
    int storageOperationMemory;
    private double weightOperationMemory;

    public OperationMemory() {
    }

    public OperationMemory(TypeOperationMemory typeOperationMemory, int storageOperationMemory, double weightOperationMemory) {
        this.typeOperationMemory = typeOperationMemory;
        this.storageOperationMemory = storageOperationMemory;
        this.weightOperationMemory = weightOperationMemory;
    }

    public TypeOperationMemory getTypeOperationMemory() {
        return typeOperationMemory;
    }

    public void setTypeOperationMemory(TypeOperationMemory typeOperationMemory) {
        this.typeOperationMemory = typeOperationMemory;
    }

    public int getStorageOperationMemory() {
        return storageOperationMemory;
    }

    public void setStorageOperationMemory(int storageOperationMemory) {
        this.storageOperationMemory = storageOperationMemory;
    }

    public double getWeightOperationMemory() {
        return weightOperationMemory;
    }

    public void setWeightOperationMemory(double weightOperationMemory) {
        this.weightOperationMemory = weightOperationMemory;
    }

    @Override
    public String toString() {
        return "typeOperationMemory = " + typeOperationMemory +
                ", storageOperationMemory = " + storageOperationMemory +
                ", weightOperationMemory = " + weightOperationMemory + '}';
    }
}

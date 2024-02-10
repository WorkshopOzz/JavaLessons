package PC;

import PC.Enums.Type_hd;

public class HD {
    Type_hd type_hd;
    int storageMemory;
   private double weight_hd;

    public HD() {
    }

    public HD(Type_hd type_hd, int storageMemory, double weight_hd) {
        this.type_hd = type_hd;
        this.storageMemory = storageMemory;
        this.weight_hd = weight_hd;
    }

    public Type_hd getType_hd() {
        return type_hd;
    }

    public void setType_hd(Type_hd type_hd) {
        this.type_hd = type_hd;
    }

    public int getStorageMemory() {
        return storageMemory;
    }

    public void setStorageMemory(int storageMemory) {
        this.storageMemory = storageMemory;
    }

    public double getWeight_hd() {
        return weight_hd;
    }

    public void setWeight_hd(double weight_hd) {
        this.weight_hd = weight_hd;
    }

    @Override
    public String toString() {
        return "type_hd = " + type_hd +
                ", storageMemory = " + storageMemory +
                ", weight_hd = " + weight_hd + '}';
    }
}

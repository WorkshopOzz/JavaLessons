package PC;

import PC.Enums.CPU_frequency;
import PC.Enums.CoreCount;
import PC.Enums.Fabricator;

public class CPU {
       private CPU_frequency cpuFrequency;
        private CoreCount coreCount;
       private Fabricator fabricator;
       private double weight_cpu;

    public CPU() {
    }

    public CPU(CPU_frequency cpuFrequency, CoreCount coreCount, Fabricator fabricator, double weight) {
        this.cpuFrequency = cpuFrequency;
        this.coreCount = coreCount;
        this.fabricator = fabricator;
        this.weight_cpu = weight;
    }

    public CPU_frequency getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(CPU_frequency cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Fabricator getFabricator() {
        return fabricator;
    }

    public void setFabricator(Fabricator fabricator) {
        this.fabricator = fabricator;
    }

    public double getWeight() {
        return weight_cpu;
    }

    public void setWeight(double weight) {
        this.weight_cpu = weight;
    }

    @Override
    public String toString() {
        return "cpuFrequency = " + cpuFrequency +
                ", coreCount = " + coreCount +
                ", fabricator = " + fabricator +
                ", weight_cpu = " + weight_cpu + '}';
    }
}

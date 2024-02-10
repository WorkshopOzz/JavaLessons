package PC;

public class Computer {
    CPU cpu;
    OperationMemory operationMemory;
    HD hdd;
    Screen screen;
    Keyboard keyboard;
    public static final String vendor = "Razor";
    public static final String name = "Viper";

    public Computer() {
    }

    public Computer(CPU cpu, OperationMemory operationMemory, HD hdd, Screen screen, Keyboard keyboard) {
        this.cpu = cpu;
        this.operationMemory = operationMemory;
        this.hdd = hdd;
        this.screen = screen;
        this.keyboard = keyboard;
    }
    public double weightComputer() {
       return  cpu.getWeight() + hdd.getWeight_hd() + keyboard.getWeightKeyboard() +
                operationMemory.getWeightOperationMemory() + screen.getWeight_screen();
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public OperationMemory getOperationMemory() {
        return operationMemory;
    }

    public void setOperationMemory(OperationMemory operationMemory) {
        this.operationMemory = operationMemory;
    }

    public HD getHdd() {
        return hdd;
    }

    public void setHdd(HD hdd) {
        this.hdd = hdd;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }



    @Override
    public String toString() {
        return "PC.Computer{" +
                "cpu = " + cpu +
                ", operationMemory = " + operationMemory +
                ", hdd = " + hdd +
                ", screen = " + screen +
                ", keyboard = " + keyboard + '}';
    }
}

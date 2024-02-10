import Calc.*;
import PC.*;
import PC.Enums.*;

public class Main {
    public static void main(String[] args) {
        CoreCount.ArithmeticCalculator arithmeticCalculator = new CoreCount.ArithmeticCalculator(2, 3);
        arithmeticCalculator.calculate(Operation.SUBTRACT);


        Computer computer = new Computer(new CPU(CPU_frequency.CPU_FREQUENCY_40, CoreCount.CORE_COUNT_4, Fabricator.INTEL, 200),
                new OperationMemory(TypeOperationMemory.DDR_4, 8, 50),
                new HD(Type_hd.SSD, 500, 400),
                new Screen(24, TypeMatrix.IPS, 500),
                new Keyboard(TypeKeyboard.KEYBOARD_USB, Backlight.BACKLIGHT_WITHOUT, 600));

        System.out.println(computer);
        System.out.println(computer.weightComputer());
    }
}
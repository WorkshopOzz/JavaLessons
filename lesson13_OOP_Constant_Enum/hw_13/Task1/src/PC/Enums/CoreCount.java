package PC.Enums;

import Calc.Operation;

public enum CoreCount {
    CORE_COUNT_1 (1),
    CORE_COUNT_2 (2),
    CORE_COUNT_4 (4);
    public final int count;

    CoreCount(int count) {
        this.count = count;
    }

    public static class ArithmeticCalculator {
     private double numA;
       private double numB;
    public void calculate (Operation type) {
    //   if (type == Calc.Operation.ADD)
    //       System.out.println(numA + " + " + numB +" =  "  + (numA + numB));
    //   else if (type == Calc.Operation.MULTIPLY)
    //       System.out.println( numA + " * " + numB +" =  " + (numA * numB));
    //   else if (type == Calc.Operation.SUBTRACT) {
    //       System.out.println( numA + " / " + numB +" =  " + (numA / numB));
    //   }
    //   else {
    //       System.out.println(" Не правильный ввод. Попробуйт снова");
    switch (type) {
        case ADD:
            System.out.println(numA + " + " + numB +" =  "  + (numA + numB));
            break;
        case MULTIPLY:
            System.out.println( numA + " * " + numB +" =  " + (numA * numB));
            break;
        case SUBTRACT:
            System.out.println( numA + " / " + numB +" =  " + (numA / numB));
            break;

    }


    }
        public ArithmeticCalculator(double numA, double numB) {
            this.numA = numA;
            this.numB = numB;

        }

        public double getNumA() {
            return numA;
        }

        public void setNumA(double numA) {
            this.numA = numA;
        }

        public double getNumB() {
            return numB;
        }

        public void setNumB(double numB) {
            this.numB = numB;
        }
    }
}


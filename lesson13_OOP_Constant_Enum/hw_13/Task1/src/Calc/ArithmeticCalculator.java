package Calc;//
public class ArithmeticCalculator {
    double numA;
    double numB;
    public void calculate (Operation type) {
//   if (type == Operation.ADD)
//       System.out.println(numA + " + " + numB +" =  "  + (numA + numB));
//   else if (type == Operation.MULTIPLY)
//       System.out.println( numA + " * " + numB +" =  " + (numA * numB));
//   else if (type == Operation.SUBTRACT) {
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
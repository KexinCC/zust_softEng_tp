package divideByZero;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.err.printf("Caught ArithmeticException= %s\n", e);
        }
        System.out.println(3 / 0);
    }


}


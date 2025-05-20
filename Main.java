import java.util.Scanner;


    
interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

class SimpleCalculator implements  Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calc.add(a, b));
        System.out.println(calc.multiply(a, b));
        System.out.println(Calculator.subtract(a, b));
        sc.close();
    }
}

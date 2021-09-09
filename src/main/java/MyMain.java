import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(double x) {
        int fact = 1;
        for (int i = x; i >= 1; i--) {
            fact *= i;
        }   
        return fact;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 1;
        int i = 0;
        while (Math.E - e > 0.00000000001) {
            i++;
            e += 1/factoria(i)
        }
        return e;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(int x) {
        double guess = 10;
        double root = (guess + x/guess)/2;
        while (Math.abs(root - guess) > 0.00001) {
            guess = root;
            fact = (root + x/root)/2;
        }
        return root;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("gimme a double");
        double x = scan.nextDouble();
        System.out.println(babylonian(x));
        System.out.println("gimme an int");
        int y = scan.nextInt();
        System.out.println(factorial(y));
        System.out.println(calculateE()); 
    }
}

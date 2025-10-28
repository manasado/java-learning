public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical operators
        boolean result = (a > 0 && b > 0);
        System.out.println("Both positive? " + result);
        // Assignment operator
        a += 3; // same as a = a + 3
        System.out.println("New value of a: " + a);
    }
}
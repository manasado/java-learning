public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Declare and initialize array
        System.out.println("First number: " + numbers[0]); // Access elements by index
        System.out.println("All numbers:"); // Loop through array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
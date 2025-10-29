public class ModifiersExample {   // Public class - accessible from anywhere
    private int secretCode = 1234; // Private variable - accessible only within this class

    public void displayCode() {     // Public method - accessible from other classes
        System.out.println("Secret code: " + secretCode);
    }
    public static void main(String[] args) {
        ModifiersExample obj = new ModifiersExample();
        obj.displayCode();
    }
}

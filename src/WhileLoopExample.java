public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {   //Repeated until condition false
            System.out.println("Count: " + i);
            i++; // increase i to avoid infinite loop
        }
    }
}
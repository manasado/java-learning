public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Number: " + i); //Repeated until condition false
            //After first run
            i++;
        } while (i <= 3);
    }
}
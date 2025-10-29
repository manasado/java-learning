public class CharacterExample {
    public static void main(String[] args) {
        char letter = 'A';
        char Uppercase='A';
        char Lowercase='a';
        int asciiLowercase=(int)Lowercase;
        int asciiUppercase=(int)Uppercase;
        System.out.println("Character: " + letter);
        System.out.println("Lowercase Letter:"+Lowercase);
        System.out.println("Uppercase Letter:"+Uppercase);
        System.out.println("Ascii value of 'a':"+asciiLowercase);
        System.out.println("Ascii value of 'A':"+asciiUppercase);

        // I can perform operations on characters
        char nextLetter = (char) (letter + 1);  // ASCII value +1
        System.out.println("Next Character: " + nextLetter);

        // Check if a character is a digit or letter
        System.out.println("Is Digit? " + Character.isDigit(letter));
        System.out.println("Is Letter? " + Character.isLetter(letter));
    }
}
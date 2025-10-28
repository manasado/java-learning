public class StringExample {
    public static void main(String[] args) {
        String name = "Java Programming";
        System.out.println("Length: " + name.length());    // Common String methods
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Contains 'Java'? " + name.contains("Java"));
        System.out.println("Substring(0,4): " + name.substring(0, 4));
        System.out.println(name.indexOf("Pro")); //position on the letter
    }
}
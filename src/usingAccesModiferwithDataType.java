public class usingAccesModiferwithDataType {
    public int age = 25;       // public variable, type = int
    private String name = "Manasa"; // private variable, type = String

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        usingAccesModiferwithDataType D = new usingAccesModiferwithDataType();
       D.showDetails(); // Accessing public method
        //System.out.println(D.age);
        //System.out.println(D.name);
    }
}
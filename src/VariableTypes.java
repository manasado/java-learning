public class VariableTypes {
    int instanceVar = 10;  // Instance variable (belongs to each object)
    static int staticVar = 20;  // Static variable (shared among all objects)

    void display() {  //declared variables inside the method
        int localVar = 30;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }
    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.display();
    }
}
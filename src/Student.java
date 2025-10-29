class Student {
    String name; // Global variable (Instance variable)
    int age;
    Student(String n, int a) {    // Constructor
        // Local variables (parameters n and a)
        this.name = n; // Using 'this' to refer to global variables
        this.age = a;
    }

    void displayInfo() {
        // Local variable
        String info = "Student Details:";
        System.out.println(info);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Local variables inside main
        String studentName = "Manasa";
        int studentAge = 22;

        // Creating object using constructor
        Student s1 = new Student(studentName, studentAge);

        // Calling method
        s1.displayInfo();
    }
}
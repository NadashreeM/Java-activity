package par;

public class student 
{
	String name;
    private int id;
    private double GPA;

    // Default Constructor
    public student() {
        // Default values
        this.name = "Unknown";
        this.id = 0;
        this.GPA = 0.0;
    }

    // Parameterized Constructor
    public student(String name, int id, double GPA) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + GPA);
    }

    // Getters and setters for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public static void main(String[] args) {
        // Creating an instance of Student using default constructor
        student student1 = new student();

        // Accessing and modifying attributes
        student1.setName("John Doe");
        student1.setId(12345);
        student1.setGPA(3.8);

        // Displaying student information
        student1.displayInfo();
    }
}


//Constructor Overloading in Java allows a class to have more than one constructor with different parameter lists. This enables the creation of objects in different ways, providing flexibility in object initialization.

public class Employee {
    String name ;
    double salary;

     Employee() {
        this.name = "Unknown";
        this.salary = 0.0;
    }

     Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

     void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Chhavi", 50000);

        System.out.println("Employee 1:");
        emp1.displayInfo();

        System.out.println("\nEmployee 2:");
        emp2.displayInfo();
    }
    
    
}

abstract class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
    abstract double calculateSalary();
    void displayRole(){
        System.out.println("Employee Name:"+name);
    }

}
class FullTimeEmployee extends Employee
{
    double monthlysalary;
    FullTimeEmployee(String name , double monthlysalary){
        super(name);
        this.monthlysalary=monthlysalary;
    }
    @Override
    double calculateSalary() {
        return monthlysalary;
    }



}
class PartTimeEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;
    
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
}
public class EmployeeSalaryDemo{
    public static void main(String[] args) {
        Employee e1 =new FullTimeEmployee("Chhavi",500000);
        Employee e2 = new PartTimeEmployee("Rohit", 200, 80);
        e1.displayRole();
        System.out.println("Salary:"+e1.calculateSalary());
        e2.displayRole();
        System.out.println("Salary:"+e2.calculateSalary());
    }
}









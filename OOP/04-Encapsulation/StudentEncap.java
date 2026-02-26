class Student{
    private String name;
    private int marks;
    Student(String name, int marks){
        this.name = name;
        setmarks(marks);
    }
    public void setmarks(int marks){
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        }
        else{
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
    }
    public int getmarks(){
        return marks;

    }
    public String getName(){
        return name;
    }
    public String gradeCalculate(){
        if(marks >= 90){
            return "A";
        }
        else if(marks >= 80){
            return "B";
        }
        else if(marks >= 70){
            return "C";
        }
        else if(marks >= 60){
            return "D";
        }
        else{
            return "F";
        }
    }
}
public class StudentEncap {
    public static void main(String[] args) {
        Student student = new Student("Chhavi", 85);
        Student student2 = new Student("Rahul", 92);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Marks: " + student.getmarks());
        System.out.println("Grade: " + student.gradeCalculate());
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Marks: " + student2.getmarks());
        System.out.println("Grade: " + student2.gradeCalculate());
        
        student.setmarks(105); // Attempt to set invalid marks
    }
}
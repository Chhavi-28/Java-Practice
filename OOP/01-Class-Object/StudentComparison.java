public class StudentComparison {
    String name;
    int marks;
    StudentComparison(String name , int marks){
        this.name=name;
        this.marks=marks;
    }
    void displayStudentDetails(){
        System.out.println("Name :"+name);
        System.out.println("Marks :"+marks);
    }
    public static void main(String[] args) {
        StudentComparison student1 = new StudentComparison("Jay", 85);
        StudentComparison student2 = new StudentComparison("Chhavi", 92);
        StudentComparison student3 = new StudentComparison("Rahul", 78);
        System.out.println("Student 1 Details:");
        student1.displayStudentDetails();
        System.out.println("\nStudent 2 Details:");
        student2.displayStudentDetails();
        System.out.println("\nStudent 3 Details:");
        student3.displayStudentDetails();
        if(student1.marks>student2.marks && student1.marks>student3.marks){
            System.out.println("\nTopper is "+student1.name + " with marks :"+student1.marks);
        }
        else if(student2.marks>student1.marks && student2.marks>student3.marks){
            System.out.println("\nTopper is "+student2.name + " with marks :"+student2.marks);
        }
        else if(student1.marks==student2.marks && student1.marks>student3.marks){
            System.out.println("\nThere is a tie between "+student1.name + " and "+student2.name + " with marks :"+student1.marks);
        }
        else if(student1.marks==student3.marks && student1.marks>student2.marks){
            System.out.println("\nThere is a tie between "+student1.name + " and "+student3.name + " with marks :"+student1.marks);
        }
        else if(student2.marks==student3.marks && student2.marks>student1.marks){
            System.out.println("\nThere is a tie between "+student2.name + " and "+student3.name + " with marks :"+student2.marks);
        }
        else{
            System.out.println("\nTopper is "+student3.name + " with marks :"+student3.marks);
        }
    }
}

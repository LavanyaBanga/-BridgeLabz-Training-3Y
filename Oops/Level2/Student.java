public class Student {
    String name;
    int rollNumber;
    double marks;

   
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 75) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }

    
    public static void main(String[] args) {
        // Example students
        Student s1 = new Student("Lavanya Banga", 101, 92.5);
        Student s2 = new Student("Muskan Sharma", 102, 78.0);
        Student s3 = new Student("Sparsh Kumar", 103, 58.0);
        Student s4 = new Student("Jatin Verma", 104, 45.0);

      
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
        System.out.println();
        s3.displayDetails();
        System.out.println();
        s4.displayDetails();
    }
}

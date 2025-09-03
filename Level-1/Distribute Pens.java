// Class to divide pens among students
class PenDistribution {
    public static void main(String[] args) {
        
        // Create variables for pens and students
        int pens = 14;
        int students = 3;

        // Calculate pens per student
        int penPerStudent = pens / students;

        // Calculate remaining pens
        int remainingPens = pens % students;

        // Display result
        System.out.println("The Pen Per Student is " + penPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}

import java.util.Random;

public class EmployeeBonus {

   
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2]; 

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000);
            int years = 1 + rand.nextInt(10);
    
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }


    public static double[][] calculateBonus(int[][] data) {
        int n = data.length;
        double[][] result = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05; // 5%
            } else {
                bonus = salary * 0.02; // 2%
            }

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = salary + bonus;
        }
        return result;
    }

    
    public static void displayResults(int[][] data, double[][] results) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s%n",
                "EmpID", "Salary", "Years", "Bonus", "New Salary", "Total Bonus");

        for (int i = 0; i < data.length; i++) {
            int years = data[i][1];
            double oldSalary = results[i][0];
            double bonus = results[i][1];
            double newSalary = results[i][2];

            System.out.printf("%-10d %-12.2f %-12d %-12.2f %-12.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);

            totalOld += oldSalary;
            totalBonus += bonus;
            totalNew += newSalary;
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12s %-12.2f %-12.2f%n",
                "TOTAL", totalOld, "", totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int n = 10; 

     
        int[][] data = generateEmployeeData(n);

       
        double[][] results = calculateBonus(data);

      
        displayResults(data, results);
    }
}

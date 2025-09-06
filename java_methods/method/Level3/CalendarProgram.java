import java.util.Scanner;

public class CalendarProgram {

  
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

   
    static int getFirstDayOfMonth(int month, int year) {
        int q = 1; 
        int m = month;
        int y = year;

        if (m == 1) { 
            m = 13;
            y = year - 1;
        }
        if (m == 2) { 
            m = 14;
            y = year - 1;
        }

        int k = y % 100; 
        int j = y / 100; 

        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;

       
        int dayOfWeek = ((h + 6) % 7); 
        return dayOfWeek;
    }

   
    static void printCalendar(int month, int year) {
        
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        } else {
            daysInMonth[2] = 28;
        }

        System.out.println("\n  " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = daysInMonth[month];

        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

      
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%4d", day);

            if (((day + firstDay) % 7 == 0) || (day == totalDays)) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}

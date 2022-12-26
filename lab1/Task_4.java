package lab1;
import java.util.Scanner;
//challenge accepted and done
public class Task_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        An employee must work at least 8 hours per day
        So the minimum hours he works per week will be 56
         */
        System.out.print("Enter no of hours you work per week (minimum 56): ");
        int workingHours=scan.nextInt();
        //The equivalent hours per day will be
        double workingHoursPerDay=workingHours/7.0;
        System.out.print("Enter amount of money you make per hour: ");
        double amountPerHour=scan.nextDouble();
        /*
        -> Gross yearly income can be calculated by multiplying
           no of hours worked per year with amount of money
           made per hour.
        -> no of hours worked per year=no of hours worked per day
           multiplied with 365 days
         */
        double grossYearlyIncome=workingHoursPerDay*365.0*amountPerHour;
        System.out.println("Gross income of the year is: "+grossYearlyIncome);
        System.out.println("\n\n\t\t***BONUS***");
        System.out.print("Enter your vacation days per month: ");
        int vacationDaysPerMonth=scan.nextInt();
        //Here we convert vacation days into vacation hours
        int vacationHoursPerMonth=vacationDaysPerMonth*8;
        /*
        -> Payment of vacation days per year can be calculated by
           multiplying vacation days per year with amount of money
           made per hour
        -> vacation days per year = vacation days per month multiply with 12.0
         */
        double vacationSalaryPerYear=vacationHoursPerMonth*12.0*amountPerHour;
        /*
        Actually employee is paid according to the hours he works per week
        without excluding the payment of vacation days.
         */
        System.out.println("Amount of money you get on vacation days per year (Bonus): "+vacationSalaryPerYear);
        double netSalary=grossYearlyIncome-vacationSalaryPerYear;
        System.out.println("If employee is not paid for vacation days then his net income will be: "+netSalary);
    }
}
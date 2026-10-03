import java.util.Scanner;
//imported scanner to read user input
public class ScoringSystem 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        //Created a scanner
        System.out.print("Enter Customer Tesimonial Score");
        String CustomerTestimonial = input.nextLine();
        //Print statement asking for Customer Testimal Score input

        System.out.print("Enter Employee Morale Score");
        String EmployeeMorale = input.nextLine();

        System.out.print("Enter Profitabilty Score");
        String Profitability = input.nextLine();

        

        
    }
    

}
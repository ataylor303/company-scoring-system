import java.util.Scanner;
//imported scanner to read user input
public class ScoringSystem 
{

    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Amazon Scoring System!");

        Scanner input = new Scanner(System.in);
        //Created a scanner
        System.out.print("Enter Customer Testimonial Score: ");
        String CustomerTestimonial = input.nextLine();
        //Print statement asking for Customer Testimal Score input

        System.out.print("Enter Employee Morale Score: ");
        String EmployeeMorale = input.nextLine();

        System.out.print("Enter Profitabilty Score: ");
        String Profitability = input.nextLine();

        System.out.print("Enter Growth Revenue Score: ");
        String GrowthRevenue = input.nextLine();

        System.out.print("Enter Social Impact Score: ");
        String SocialImpact = input.nextLine();
        
    }
    

}
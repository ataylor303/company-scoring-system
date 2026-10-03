//imported scanner to read user input
import java.util.Scanner;

3public class ScoringSystem 
{

    public static void main(String[] args) 
    {
         //Created a scanner
        Scanner input = new Scanner(System.in);

        //Intistalized weight variable for factors
        double CTWeight = 0.40;
        double EMWeight = 0.20;
        double PWeight = 0.25;
        double GRWeight = 0.10;
        double SIWeight = 0.05;

        //Welcoming Print Statement
        System.out.println("Welcome to the Amazon Scoring System !");

        
        //Asking for user input on Customer Testimonial Score 
        System.out.print("Enter Customer Testimonial Score: ");
        double CustomerTestimonial = input.nextLine();

        //Asking user input on Employee Morale Score 
        System.out.print("Enter Employee Morale Score: ");
        double EmployeeMorale = input.nextLine();

        //Asking user for input on Profitability Score
        System.out.print("Enter Profitability Score: ");
        double Profitability = input.nextLine();

        //Asking for user input on Growth Revenue Score
        System.out.print("Enter Growth Revenue Score: ");
        double GrowthRevenue = input.nextLine();
        
        //Asking for user input for Social Impact Score
        System.out.print("Enter Social Impact Score: ");
        double SocialImpact = input.nextLine();
        //Asking for user input for Social Impact Score

        //Displaying the overall Company Score
        System.out.print("This is your overall Company Score: " + Com);
        
    }
    

}
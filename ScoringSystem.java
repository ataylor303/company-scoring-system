import java.util.Scanner;
//imported scanner to read user input
public class ScoringSystem 
{

    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Amazon Scoring System !");

        Scanner input = new Scanner(System.in);
        //Created a scanner
        System.out.print("Enter Customer Testimonial Score: ");
        String CustomerTestimonial = input.nextLine();
        //Asking for user input for Customer Testimonial Score 

        System.out.print("Enter Employee Morale Score: ");
        String EmployeeMorale = input.nextLine();
        //Asking for user input for Customer Testimonial Score

        System.out.print("Enter Profitability Score: ");
        String Profitability = input.nextLine();
        //Asking for user input for Profitability Testimonial Score

        System.out.print("Enter Growth Revenue Score: ");
        String GrowthRevenue = input.nextLine();
        //Asking for user input for Growth Revenue Score

        System.out.print("Enter Social Impact Score: ");
        String SocialImpact = input.nextLine();
        //Asking for user input for Social Impact Score

        System.out.print("This is your overall Company Score: ");
        String CompanyScore = input.nextLine();
        //Displaying the overall Company Score
        
    }
    

}
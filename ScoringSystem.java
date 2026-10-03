//imported scanner to read user input
import java.util.Scanner;

3public class ScoringSystem 
{

    public static void main(String[] args) 
    {
         //Created a scanner
        Scanner input = new Scanner(System.in);

        //Intitionaized the weight variable for factors
        double CTweight = 0.40;
        double EMweight = 0.20;
        double Pweight = 0.25;
        double GRweight = 0.10;
        double SIweight = 0.05;

        //Intitionaized the overall Company Score
        double companyscore;

        //Welcoming Print Statement
        System.out.println("Welcome to the Amazon Scoring System !");

        
        //Asking for user input on Customer Testimonial Score 
        System.out.print("Enter Customer Testimonial Score: ");
        double customertestimonial = input.nextDouble();

        //Asking user input on Employee Morale Score 
        System.out.print("Enter Employee Morale Score: ");
        double employeemorale = input.nextDouble();

        //Asking user for input on Profitability Score
        System.out.print("Enter Profitability Score: ");
        double profitability = input.nextDouble();

        //Asking for user input on Growth Revenue Score
        System.out.print("Enter Growth Revenue Score: ");
        double growthrevenue = input.nextDouble();
        
        //Asking for user input for Social Impact Score
        System.out.print("Enter Social Impact Score: ");
        double socialimpact = input.nextDouble();
        //Asking for user input for Social Impact Score



       companyscore = 
       (CTweight * customertestimonial) + (EMweight * employeemorale) +
       (Pweight * profitability) + (GRweight * growthrevenue) +
       (SIweight * socialimpact);
       
       


        //Displaying the overall Company Score
        System.out.print("This is your overall Company Score: " + companyscore );
        
    }
    

}
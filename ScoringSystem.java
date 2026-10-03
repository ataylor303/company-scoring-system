//imported scanner to read user input
import java.util.Scanner;

public class ScoringSystem 
{

    public static void main(String[] args) 
    {
         //Created a scanner
        Scanner input = new Scanner(System.in);

        //Intitionaized the weight variable for factors
        double CTweight = 0.40;
        double EMweight = 0.20;
        double Pweight = 0.25;
        double RGweight = 0.10;
        double SIweight = 0.05;

        //Intitionaized the overall Company Score
        double companyscore;

        // Statement will let the ouser know how the scoring system works
        System.out.print("                                Amazon Company Scoring System\n");
        System.out.println("            Please enter a score from 0 to 100 for each of the following factors");
        System.out.println();

        
        //Asking for user input on Customer Testimonial Score 
        System.out.print("Customer Testimonial Score: ");
        double customertestimonial = input.nextDouble();

        //Asking user input on Employee Morale Score 
        System.out.print("Employee Morale Score: ");
        double employeemorale = input.nextDouble();

        //Asking user for input on Profitability Score
        System.out.print("Profitability Score: ");
        double profitability = input.nextDouble();

        //Asking for user input on Growth Revenue Score
        System.out.print("Growth Revenue Score: ");
        double revenuegrowth = input.nextDouble();
        
        //Asking for user input for Social Impact Score
        System.out.print("Social Impact Score: ");
        double socialimpact = input.nextDouble();
        //Asking for user input for Social Impact Score


        //Calculation for the Overall Company Score
       companyscore = 
       (CTweight * customertestimonial) + (EMweight * employeemorale) + (Pweight * profitability) +
       (RGweight * revenuegrowth) + (SIweight * socialimpact);

        //Displaying the overall Company Score
        System.out.println();
        System.out.println("This is your overall Company Score: " + companyscore + "/100");
        
        //Closed Scanner
        input.close();
    }
    

}
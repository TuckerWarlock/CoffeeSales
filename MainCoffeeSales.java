/*
Tucker Warlock
CSC 240 Java Programming
7/24/2020
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainCoffeeSales {
    static double numberOfBags = 0;
    static double weightPerBag = 0;

    public static void main(String[] args) {

        //The main method for greeting the user when the program begins with
        // “Welcome to the Coffee Sales Calculator.” or similar message.
        helloUser();

        Scanner input = new Scanner(System.in);
        char continueLoop = 'Y';
        while (continueLoop == 'Y') {
            getInput();
            results();
            System.out.println("\nDo you have another sale to ring up? Y/N (capital Y):");
            continueLoop = input.nextLine().charAt(0);
        }
        goodBye();
    }

    public static void helloUser() {
        System.out.println("Welcome to the Coffee Sales Tracker.");
        System.out.println("This program will calculate the amount due" +
                "  for your coffee sales transactions.");
    }

    //A method for user input for the bag weight and number of bags.
    public static void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of bags: ");
        numberOfBags = input.nextDouble();
        System.out.println("Enter weight per bag: ");
        weightPerBag = input.nextDouble();
    }

    //A method that handles output for the results.
    // The results will include the current date calculated using the built-in Date class.
    // Align the output to look like a sales receipt.
    public static void results(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.now();

        CoffeeCalculations myCalculation = new CoffeeCalculations();
        System.out.printf("Number of bags: " + "%.0f", numberOfBags);
        System.out.printf("\nWeight per bag: " + "%.2f", weightPerBag);
        System.out.println("\nToday's date: " + dtf.format(localDate));
        System.out.println("Price per pound: $" + myCalculation.getPrice());
        System.out.printf("Sales tax: %%" + "%.2f", (myCalculation.getTaxRate()) * 100);
        System.out.printf("\nSales sub total: $" + "%.2f", myCalculation.getSale());
        System.out.printf("\nTotal tax: $" + "%.2f", myCalculation.getSaleTax());
        System.out.printf("\nTotal Sale: $" + "%.2f", myCalculation.getTotalPrice());
    }

    //A method for output of a message that is displayed when the user is done calculating coffee sales.
    public static void goodBye(){
        System.out.println("\nThank you and have a great day. Goodbye.");
    }
}

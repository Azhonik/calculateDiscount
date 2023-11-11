
import java.util.Scanner;

public class Main {

    //This is a function to calculate a discount
    public static double discount(double sumOfPurchase, int typeOfCustomer){

        //Declaring an empty variable to store a discounted value
        double discountedPrice = 0;


        //Checking the types of customers
        if(typeOfCustomer == 1){
            discountedPrice = sumOfPurchase - (sumOfPurchase*0.15);
        }else if(typeOfCustomer == 2){
            discountedPrice = sumOfPurchase - (sumOfPurchase*0.10);
        }
        return discountedPrice;

    }



    public static void main(String[] args) {
        //Defining a scanner object
        Scanner scanner = new Scanner(System.in);
        double totalSum;
        int customerType;

        do {
            System.out.println("Please, enter a total sum of purchase: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a numeric value only");
                scanner.next(); // consume the invalid input
            }

            totalSum = scanner.nextInt();

            if (totalSum <= 0) {
                System.out.println("Total sum must be a positive number.");
            }

        } while (totalSum <= 0);







            //Checking if user enters correct type of customer
            do {
                System.out.println("Please, enter a customer type: \n1 - for regular customers\n2 - for new customers");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number (1 or 2): ");
                    scanner.next(); // consume the invalid input
                }
                customerType = scanner.nextInt();

                if (customerType != 1 && customerType != 2) {
                    System.out.println("Enter only 1 or 2.");
                }

            } while (customerType != 1 && customerType != 2);




                //Storing the result in a variable
                double result = discount(totalSum, customerType);


                //Printing last message about discounted price
                System.out.println("The price after the discounting is " + result);

                scanner.close();









    }



}
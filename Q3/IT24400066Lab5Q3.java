import java.util.Scanner;

public class IT24400066Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date(1-31): ");
        int startDate = input.nextInt();
        System.out.print("Enter End Date(1-31): ");
        int endDate = input.nextInt();

        int reservedDays = 0;
        double amountToPay = 0.0;

        if (((startDate <= 31) && (startDate > 0)) && ((endDate <= 31) && (endDate > 0))){
            if (startDate <= endDate){
                reservedDays = endDate - startDate;

                if (reservedDays < 3){
                    System.out.println("No discount");
                }
                else if ((reservedDays == 3) || (reservedDays == 4)) {
                    //Calculation for Discount 10%
                    amountToPay = (48000.0 * reservedDays * 90) /100;
                }
                else if (reservedDays >= 5) {
                    //Calculation Discount 20%
                    amountToPay = (48000.0 * reservedDays * 80) /100;
                }
                else {
                    System.out.println("Invalid Process. Program Terminated");
                }
            }
            else {
                System.out.println("Start day must be less than End date.");
            }
        }
        else {
            System.out.println("Day must be between 1 and 31.");
        }
        System.out.println();
        System.out.println("Room Charge Pre Day : Rs. 48000.0");
        System.out.println("Number of Days Reserved : "+reservedDays);
        System.out.println("Total Amount to be Paid : "+amountToPay);
    }
}



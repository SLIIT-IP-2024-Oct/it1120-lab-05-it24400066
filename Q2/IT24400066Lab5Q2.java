import java.util.Scanner;

public class IT24400066Lab5Q2 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of new members introduced (>= 0):");
        int newMembers = scanner.nextInt();

        if (newMembers < 0) {
            System.out.println("Invalid input! The number of new members should be 0 or greater.");
        }else {
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            System.out.println("The customer is entitled to:" + prize);
        }



    }
}

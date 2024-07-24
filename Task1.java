import java.util.Scanner;

class ATM {
    int pin = 21580;
     int balance = 10000;

    ATM(int enteredPin) {

        if (pin == enteredPin) {
            menu();
        } else {
            System.out.println("Invalid pin");
        }
    }

    void menu() {
        Scanner t = new Scanner(System.in);
        System.out.println("Choose the option According to your convenience");
        System.out.println("Check Balance -> 1");
        System.out.println("Deposit -> 2");
        System.out.println("Withdrawal -> 3");
        System.out.println("Exit -> 4");

        int n = t.nextInt();

        switch (n) {
            case 1:
                System.out.println("Your balance is: " + balance);
                System.out.println("/*----------------------------------------------------------------- */");
                menu();
                break;
            case 2:
                System.out.println("Enter the deposit amount");
                int depositAmount = t.nextInt();
                balance += depositAmount;
                System.out.println("Amount Deposited");
                System.out.println("/*----------------------------------------------------------------- */");
                menu();
                break;
            case 3:
                System.out.println("Enter the withdrawal amount");
                int withdrawalAmount = t.nextInt();
                if (balance >= withdrawalAmount) {
                    balance -= withdrawalAmount;
                    System.out.println("Amount Withdrawn");
                } else {
                    System.out.println("Insufficient balance");
                }
                System.out.println("/*----------------------------------------------------------------- */");
                menu();
                break;
            case 4:
                System.out.println("EXIT");
                System.out.println("Thank you");
                break;
            default:
                System.out.println("Invalid choice");
                menu();
                break;
        }

        // Close the Scanner when done reading input
        t.close();
    }
}

public class Task1 {
    public static void main(String[] args) {
        System.out.println("WELCOME CUSTOMER");
        System.out.println("Please enter the correct pin\n_" + " _" + " _" + " _" + " _");
        Scanner scanner = new Scanner(System.in);
        int enteredPin = scanner.nextInt();

        // Create and use the ATM object
        new ATM(enteredPin);

        // Optional: Perform an explicit operation to show usage
        // This is already handled inside the ATM constructor

        scanner.close(); // Close the Scanner only when all input operations are completed
    }
}

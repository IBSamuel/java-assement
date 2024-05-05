package atm;
import java.util.Scanner;

public class Atm {
    static Scanner inputs = new Scanner(System.in);
    static int pin = 144569; // Declare 'pin' as a static field accessible to all methods
    static int accountNumber = 1212342556;
    static double accountBalanace = 12000.0;

    public static void main(String[] args) {
        // EnterPin();
        DashBoard();
    }

    // public static void EnterPin() {
    //     System.out.println("Kindly Enter Your Pin:");
    //     int enteredPin = inputs.nextInt();
        
    //     if (enteredPin == pin) {
    //         System.out.println("PIN verified successfully!");
    //     } else {
    //         System.out.println("Incorrect PIN. Access denied.");
    //     }
    // }
    public static void DashBoard(){
        System.out.println("Good Day \n What will you like to do \n you have $"  + accountBalanace + " in your account, you can do anything with it like \n 1. Withdraw \n 2. Deposit \n 3. Transfer \n what will you like to go for");
        int option = inputs.nextInt();
        if(option == 1){
            Withdraw();
        }
        else if(option == 2){
            Deposit();

        }
        else if(option == 3){
            Transfer();

        }
        else {
            System.out.println("Invalid option");
        }
    }
    public static void Withdraw(){
        System.out.println("How much would you like to withdraw?");
        int amount = inputs.nextInt();
        if(amount > accountBalanace){
            System.out.println("Insufficient funds");
        }
        else if(amount <= accountBalanace){
            accountBalanace = accountBalanace - amount;
            System.out.println("You have withdrawn $" + amount + " from your account. Your new balance is $" + accountBalanace);
        }
        else{
            System.out.println("invalid Amount");
        }

    }
    public static void Deposit() {
        System.out.println("How much would you like to deposit?");
        double amount = inputs.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        } else {
            accountBalanace += amount;
            System.out.println("You have deposited $" + amount + " into your account. Your new balance is $" + accountBalanace);
        }
    }
    public static void Transfer() {
        System.out.println("Who do you want to transfer to? (Recipient Account Number)");
        String recipientAccountNumber = inputs.next(); 
        System.out.println("Recipient Bank Name:");
        String bankName = inputs.next();
        System.out.println("Recipient Account Name:");
        String accountName = inputs.next();
    
        System.out.println("How much would you like to transfer?");
        double amount = inputs.nextDouble();
    
        if (amount > accountBalanace) {
            System.out.println("Insufficient funds");
        } else {

            accountBalanace -= amount; 
            System.out.println("You have successfully transferred $" + amount + " \n to " + accountName +
                    " at " + bankName + " \n (Account Number: " + recipientAccountNumber + ")");
            System.out.println("Your new balance is $" + accountBalanace);
        }
    }
    
    }


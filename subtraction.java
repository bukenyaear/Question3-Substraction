/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

/**
 *
 * @author Earnest Bukenya
 */
import java.util.Random; // Import Random class to generate random numbers
import java.util.Scanner; // Import Scanner class to read user input as we have inputs from the keyboard 
public class subtraction { // Define the class "subtraction"
     
    public static void main(String[] args) {
        Random random = new Random(); // Create a Random object to generate random integers
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        
        // b) Generate two single-digit integers into number1 and number2
        int number1 = random.nextInt(10); // This is to generate a random integer between 0 and 9 since its a single digit integer 
        int number2 = random.nextInt(10); // This is to generate a random second integer between 0 and 9 since its a single digit integer
        
        // c) Swap number1 and number2 if number1 is less than number2
        if (number1 < number2) {
            int temp = number1; // Use a temporary variable to hold number1
            number1 = number2; // Assign number2 to number1
            number2 = temp; // Assign the temporary variable (original number1) to number2
        }
        
        // d) Prompt the student to answer " What is numberl - number2? " 
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = scanner.nextInt(); // Read the student's answer
        
        // e) Check the student's answer and display whether the answer is correct
        if (answer == (number1 - number2)) {
            System.out.println("Correct!"); // Display "Correct!" if the answer is right
        } else {
            System.out.println("Wrong"); // Display "Incorrect" if the answer is wrong
        }
    }
}
    


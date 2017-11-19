package exercise_chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputmismatch {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try{
                System.out.println("Enter a number:");
                int result = input.nextInt();
                System.out.println("your number is " +result);
                continueInput = false;
            }catch (InputMismatchException ex){
                System.out.println("Try again! You must enter an Integer:");
                input.nextLine();
            }
        }while (continueInput);
    }
}

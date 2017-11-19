package exercise_chapter12;

import java.util.Scanner;

public class QuotientwithTryCatch {
    public static int qutient(int number1, int number2){
        if(number2 == 0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return  number1 / number2;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("input two numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try{
           int result = qutient(number1, number2);
           System.out.println(number1 + "/" + number2
                        + " = " + result);
        }catch (ArithmeticException ex){
            System.out.println("Exception: an integer "
            + "cannot be divided by zero");
        }

        System.out.println("Execution continues ...");

    }


}

package java_week_3_writing_hw;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program_6_OddEven {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number=scanner.nextInt();
        Program_6_OddEven oddEven=new Program_6_OddEven();
        System.out.println(number + " is "+oddEven.isItEvenOrOddNumber(number)+ "number");
        //closing the scanner object
        scanner.close();
    }
    //checking the odd or even
    public String isItEvenOrOddNumber(int number){
        if(number%2==0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}

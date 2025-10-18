package Arithmetic;
import java.util.Scanner;

public class Main {

    public static int Addition(int a, int b){
        return a + b;
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number: ");

        a = s.nextInt();

        System.out.print("Enter second number:");
        b = s.nextInt();

        int sum = Addition(a, b);
        System.out.println("The sum is: " + sum);
    }


}

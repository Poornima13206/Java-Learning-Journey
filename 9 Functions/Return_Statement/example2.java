//package 9 Functions.Return_Statement;
import java.util.Scanner;
public class example2 {
  public static void main(String[] args) {
    greet();
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = input.nextInt();

    System.out.print("Enter second number: ");
    int num2 = input.nextInt();

    int sum = addNumbers(num1, num2);
    System.out.println("The sum is: " + sum);

    input.close();
  }

  public static void greet(){
    System.out.println("Hello, welcome to the program!");
  }

  public static int addNumbers(int a, int b) {
    return a + b; // Return the sum of a and b
  }
}

//package 9 Functions.Return_Statement;
import java.util.Scanner;
public class example3 {
  public static void main(String[] args) {
    int num1 = readnumber();
    int num2 = readnumber();
    int sum = num1 + num2;
    System.out.println("The sum is: " + sum);
  }

  public static int readnumber(){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int num = input.nextInt();

     //input.close();
    return num;
  }

  
}

package Programs_Functions;

import java.util.Scanner;

public class sumOfOddNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = input.nextInt();
    int sum = Oddnumber(num);
    System.out.print("the sum of odd number till the num "+num+"= " +sum);
  }

  public static int Oddnumber(int num){
    int i=1 , sum = 0;
    
    while(i<=num){
      sum = sum +i;
      i+=2;
    }
    return sum;
  }
  
}

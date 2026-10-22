package Programs_Functions;
import java.util.Scanner;
public class SumOfDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the digit :");
    int num = input.nextInt();
    int sum = SumDigits(num);
    System.out.println("The sum of digits is :" +sum);
    //Scanner.close();
  }
  public static  int SumDigits(int num){
    int i=1, sum =0;

    while (i<=num) {
      sum += i;
      i++;
    }
    return sum;
  }
}

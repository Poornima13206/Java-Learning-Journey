package Programs_Functions;
import java.util.Scanner;
public class ReverseOfDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the digits : ");
    int num = input.nextInt();
    int rev = reverse(num);
    System.out.println("The reverse of the digits "+num+" is : " +rev);
    input.close();
  }

  public static int reverse(int num){
    int rev=0;
    while (num>0) {
      int digits = num%10;
       rev = rev*10 + digits;
       num = num/10;
    }
    return rev;
  }
}

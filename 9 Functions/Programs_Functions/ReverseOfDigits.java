package Programs_Functions;
import java.util.Scanner;
public class ReverseOfDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the digits :");
    int num = input.nextInt();
    int rev = reverse(num);
    System.out.println("The reverse of the digits "+num+"is : " +rev);
  }

  public static int reverse(int num){
    int i =0,rev=0;
    while (i<=num) {
      int digits = num%10;
       rev = rev*10 + digits;
       num = num/10;
    }
    return rev;
  }
}

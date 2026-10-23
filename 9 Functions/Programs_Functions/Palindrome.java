package Programs_Functions;

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the digits : ");
    int num = input.nextInt();
    int rev = reverse(num);

    if(num==rev){
    System.out.println("it's a palindrome");
  }
  else{
    System.out.println("it's not a palindrome");
  }
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

package Programs_Functions;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = input.nextInt();
    int multi = mul(n);
    System.out.println("The sum of digits is : " +multi);
    input.close();
}

public static int mul(int n){
  int i, fact = 1;
  for(i=1;i<=n;i++){
    fact = fact *i;
  }

  return fact;
}
}

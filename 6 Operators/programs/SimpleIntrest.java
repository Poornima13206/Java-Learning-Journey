package programs;

import java.util.Scanner;

public class SimpleIntrest {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the P , R, T values :");
    int p = input.nextInt();
    int t = input.nextInt();
    int r = input.nextInt();

    int SI = (p * t * r)/100;

    System.out.println("Simple intrest is :" + SI);
    input.close();
  }
}

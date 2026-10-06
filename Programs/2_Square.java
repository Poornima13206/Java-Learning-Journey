package programs;

import java.util.Scanner;

public class Square {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the length of the square :");
    int length = input.nextInt();
    
    int area = length * length ;

    int perimeter = 2 * length;

    System.out.println("area of a square is :" + area);

    System.out.println("Perimeter of a square is :" + perimeter);
    input.close();
  }
}
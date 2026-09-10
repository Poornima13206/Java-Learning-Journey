package programs;

import java.util.Scanner;

public class Rectangle {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the length and width of the rectangle :");
    int length = input.nextInt();
    int width = input.nextInt();

    int area = length * width ;

    int perimeter = 2*(length + width);

    System.out.println("area of a rectangle is :" + area);

    System.out.println("Perimeter of a rectangle is :" + perimeter);
    input.close();
  }
}

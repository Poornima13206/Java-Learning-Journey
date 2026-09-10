package programs;

import java.util.Scanner;

public class Area_triangle {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the breath and height of the rectangle :");
    float b = input.nextFloat();
    float h = input.nextFloat();

    float area = (1/2) * b * h ;

    System.out.println("area of a triangle is :" + area);

    input.close();
  }
}

import java.util.Scanner;

public class User_input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your name :");
    String name = input.nextLine();
    System.out.println("welcome " +name);
    System.out.println(name +" Also tell me your age");
    int age = input.nextInt();
    System.out.println("your age is :" + age);
    input.close();
  }
}

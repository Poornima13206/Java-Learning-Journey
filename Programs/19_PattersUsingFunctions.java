package Programs_Functions;

public class PattersUsingFunctions {
  public static void main(String[] args) {
    System.out.println("Different types of patterns using functions in Java");
    System.out.println("===================Pattern 1============================");
    pattern1();
    System.out.println("===================Pattern 2============================");
    pattern2();
    System.out.println("===================Pattern 3============================");
    pattern3();
  }

  public static void pattern1(){
    System.out.println("*\n**\n***\n****\n*****\n");
  }

  public static void pattern2(){
    System.out.println("*****\n****\n***\n**\n*\n");
  }

  public static void pattern3(){
    System.out.println("    *\n   **\n  ***\n ****\n*****");
  }
}
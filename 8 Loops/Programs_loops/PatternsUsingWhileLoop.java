package Programs_loops;

public class PatternsUsingWhileLoop {
  public static void main(String[] args) {
    System.out.println("pattrns");
    pattern1();
  }

  public static void pattern1(){
    int rows = 0;
    while(rows < 10){
      System.out.print("*");
      int i = 0;
      while(i < rows){
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows++;
    }
  }

  }


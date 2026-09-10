public class Logical_operators {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;

    // Logical AND (&&)
    System.out.println("a < b && b < c: " + (a < b && b < c)); // true
    System.out.println("a > b && b < c: " + (a > b && b < c)); // false

    // Logical OR (||)
    System.out.println("a < b || b > c: " + (a < b || b > c)); // true
    System.out.println("a > b || b > c: " + (a > b || b > c)); // false

    // Logical NOT (!)
    System.out.println("!(a < b): " + !(a < b)); // false
    System.out.println("!(a > b): " + !(a > b)); // true
  }
}

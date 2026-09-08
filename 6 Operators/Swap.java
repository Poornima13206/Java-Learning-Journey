public class Swap {
  public static void main(String[] args) {
    int temp;
    int a = 10, b = 20;
    System.out.println("value of a before swap : " +a);
    System.out.println("value of b before swap : " +b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("value of a after swap : " +a);
    System.out.println("value of b after swap : " +b);
  }
}

package programs;

public class BitwiseCompliment {
  public static void main(String[] args) {
    int a = 5; // 0101 in binary
    int complimentResult = ~a; // 1010 in binary, which is -6 in decimal (two's complement)    -(5+1)
    System.out.println("Bitwise Compliment: " + complimentResult);
  }
}

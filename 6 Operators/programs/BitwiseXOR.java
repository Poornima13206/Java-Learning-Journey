package programs;

public class BitwiseXOR {
  public static void main(String[] args) {
    int a = 5; // 0101 in binary
    int b = 3; // 0011 in binary
    int xorResult = a ^ b; // 0110 in binary, which is 6 in decimal
    System.out.println("Bitwise XOR: " + xorResult);
  }
}

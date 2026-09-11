package programs;

public class bitwiseAND {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int andResult = a & b; // 0001 in binary, which is 1 in decimal
        System.out.println("Bitwise AND: " + andResult);
    }
}

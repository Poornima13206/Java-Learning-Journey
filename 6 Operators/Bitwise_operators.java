public class Bitwise_operators {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Bitwise AND
        int andResult = a & b; // 0001 in binary, which is 1 in decimal
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b; // 0111 in binary, which is 7 in decimal
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // 0110 in binary, which is 6 in decimal
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // Inverts all bits of a
        System.out.println("Bitwise NOT: " + notResult);

        // Left Shift
        int leftShiftResult = a << 1; // Shifts bits of a to the left by 1 position
        System.out.println("Left Shift: " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 1; // Shifts bits of a to the right by 1 position
        System.out.println("Right Shift: " + rightShiftResult);
    }
}
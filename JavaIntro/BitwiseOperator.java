public class BitwiseOperator {
    public static void main(String[] args) {
        int bitmask = 0x000F;               // 0000 0000 0000 1111
        int val = 0x2222;                   // 0010 0010 0010 0010
        System.out.println(bitmask & val);  // 0000 0000 0000 0010
        System.out.println(~val);
    }
}

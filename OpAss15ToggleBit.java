public class OpAss15ToggleBit {
  public static void main(String[] args) {
        int num = 10;      // Binary: 1010
        int bitPosition = 3; // 3rd bit from right

        int result = num ^ (1 << (bitPosition - 1));

        System.out.println("Original Number = " + num);
        System.out.println("After Toggling 3rd Bit = " + result);
    }
}

public class OpAss8AbsoluteValue {
    public static void main(String[] args) {
        int num = -35;

        int abs = (num >= 0) ? num : -num;

        System.out.println("Number = " + num);
        System.out.println("Absolute Value = " + abs);
    }
}
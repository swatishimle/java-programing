public class OpAss9PositiveNegativeZero {
   public static void main(String[] args) {
        int num = -10;

        String result = (num > 0) ? "Positive"
                        : (num < 0) ? "Negative"
                        : "Zero";

        System.out.println("Number = " + num);
        System.out.println(result);
    }
}
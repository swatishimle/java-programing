public class OpAss10MediaOfThree {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 30;

        int median = (a > b)
                ? ((a < c) ? a : ((b > c) ? b : c))
                : ((b < c) ? b : ((a > c) ? a : c));

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Median = " + median);
    }
}
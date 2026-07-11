public class OperatorAss6EvenOdd {
    public static void main(String[] args) {
        int num = 25;

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number = " + num);
        System.out.println(result);
    }
}
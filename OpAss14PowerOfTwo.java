public class OpAss14PowerOfTwo {
 public static void main(String[] args) {
        int num = 16;

        if (num > 0 && (num & (num - 1)) == 0)
            System.out.println(num + " is a Power of Two");
        else
            System.out.println(num + " is Not a Power of Two");
    }
}
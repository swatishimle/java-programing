public class OpAss13BitRotation {
 public static void main(String[] args) {
        int num = 8; // Binary: 00001000

        int leftRotate = (num << 1) | (num >>> 31);
        int rightRotate = (num >>> 1) | (num << 31);

        System.out.println("Original Number = " + num);
        System.out.println("Left Rotate = " + leftRotate);
        System.out.println("Right Rotate = " + rightRotate);
    }
}

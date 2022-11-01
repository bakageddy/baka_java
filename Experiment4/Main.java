public class Main {
    public static void main(String args[]) {
        try {
            System.out.println(69/0);
        } catch (ArithmeticException e) {
            System.out.println("Wrong Denominator!");
        }
    }
}

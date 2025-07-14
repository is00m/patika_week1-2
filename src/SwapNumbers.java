public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println("a :" + a + "  b :" + b);

        int orjA = a;

        a = b;
        b = orjA;

        System.out.println("new a :" + a + "  new b :" + b);
    }
}
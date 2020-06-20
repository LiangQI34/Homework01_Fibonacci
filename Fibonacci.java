public class Fibonacci {
    private static int[] val = new int[201];

    static int of(int index) {
        if(index > 1) {
            val[index] = val[index - 1] + val[index - 2];
        }
        return val[index];
    }

    public static void main(String[] args) {
        val[0] = 0;
        val[1] = 1;

        for (int i = 1; i <= 200; i++) {
            System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci.of(i));
        }
    }
}
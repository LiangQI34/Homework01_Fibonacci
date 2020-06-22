public class Fibonacci {
    //private static int[] val = new int[201];

    static int of(int index) {
        // if(index > 1) {
        //     val[index] = val[index - 1] + val[index - 2];
        // }
        // return val[index];

        if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else return of(index - 1) + of(index - 2);
    }

    public static void main(String[] args) {
        int i = 1;
        while (of(i) <= 200) {
            System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci.of(i));
	    i++;
        }
    }
}

package w1;

public class W1disc {

    public static int f(int n) {
//        return  500 * ((int) Math.pow(n,2)) + 15 * n + 1000;
        return 100 * ((int) Math.pow(n,2)) + 7;
    }

    public static int g(int n) {
//        return 2 * ((int) Math.pow(n, 3));
        return 4 * ((int) Math.pow(n, 3)) +25;
    }

    public static void calc(int n) {
        String f = "%-5s%12s%12s%n";
        System.out.printf(f , "n", "f(n)", "g(n)");
        System.out.println("");
        for (int i = 0; i < (n+1); i++) {
            if (i % 10 == 0) {
                System.out.printf(f, String.valueOf(i), String.valueOf(f(i)), String.valueOf(g(i)));
            }
        }
    }

    public static void main(String[] args) {
        calc(260);
    }
}

public class Recursive {

    // Question 3
    private static int pow(int b, int e) {
        if (e == 0) {
            return 1;
        } else {
            return b * pow(b, e - 1);
        }
    }

    // Question 4 - Loop
    private static int sum_repeat(int a, int b) {
        while (b != 0) {
            a++;
            b--;
        }
        return a;
    }

    // Question 4 - Recursive
    private static int sum_recursive(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return sum_recursive(++a, --b);
        }
    }
    // Output
    // 3

    // Test Question 5
    private static int ff(int n) {
        if (n == 1) return 1;
        if (n % 2 == 0) return ff(n / 2);
        return ff((n - 1) / 2) + ff((n + 1) / 2);
    }

    // Test Question 6
    private static int fusc(int n, int profund) {
        int i;
        for (i = 0; i < profund; i++)
            System.out.print("...");
        System.out.println("fusc(" + n + ", " + profund + ")");
        if (n == 1) return 1;
        if (n % 2 == 0) return fusc(n / 2, profund + 1);
        return fusc((n - 1) / 2, profund + 1) + fusc((n + 1) / 2, profund + 1);
    }
    //  Output
    //  fusc(7, 0)
    //  ...fusc(3, 1)
    //  ......fusc(1, 2)
    //  ......fusc(2, 2)
    //  .........fusc(1, 3)
    //  ...fusc(4, 1)
    //  ......fusc(2, 2)
    //  .........fusc(1, 3)

    // Question 7
    private static int h(int m, int n) {
        if (n == 1) return m + 1;
        if (m == 1) return n + 1;
        return h(m, n - 1) + h(m - 1, n);
    }

    // Question 8
    private static int mdc(int x, int y) {
        if (x == y) return x;
        if (x > y) return mdc(x - y, y);
        return mdc(y, x);
    }

    //  Question 9
    private static int calc_nx(int n, int x) {
        if (x == 0) return 1;
        if (x > 0) return n * calc_nx(n, x - 1);
        return (1 / n) * calc_nx(n, x + 1);
    }

    // Question 10
    private static int sum_odd(int n) {
        if (n == 0) return 0;
        if (n % 2 != 0) return n + sum_odd(n - 1);
        return sum_odd(n - 1);
    }

    // Question 11
    private static int mod(int n, int m) {
        if (n >= m) return mod(n - m, m);
        return n;
    }

    // Question 12
    private static String dec_to_hex(int dec) {
        if (dec < 16) return Integer.toHexString(dec).toUpperCase();
        return dec_to_hex(dec / 16) + Integer.toHexString(dec % 16).toUpperCase();
    }

    // Complement 13
    private static int fat(int x) {
        if (x == 0 || x == 1) return 1;
        return x * fat(x - 1);
    }

    // Question 13
    public static int func_x(int x) {
        if (x % 3 == 0) return x * x;
        if (x % 3 == 1) return x + 3;
        return fat(x);
    }

    // Test Question 14
    private static int puzzle(int base, int limit) {
        if (base > limit) return -1;
        else if (base == limit) return 1;
        else return base * puzzle(base + 1, limit);
    }
    // a) base > limit = -1; base == 1 = 1;
    // b) else return base * puzzle(base + 1, limit);
    // c) Output
    // puzzle(14,10) = -1
    // puzzle(4,7) = 120
    // puzzle(0,0) = 1

    // Question 15
    private static double sum(int n) // n>=1
    {
        if (n <= 1) return 1;
        return 1.0 / n + sum(n - 1);
    }

    // Question 16
    private static double cal_sum(int n) {
        if (n <= 1) return 1;
        if (n % 2 == 0) {
            return -1.0 / n + cal_sum(n - 1);
        } else {
            return 1.0 / n + cal_sum(n - 1);
        }
    }

    // Test Question 17
    private static int F(int N) {
        if (N < 4) return 3 * N;
        else return 2 * F(N - 4) + 5;
    }
    // Output
    // F(3) = 9
    // F(7) = 23

    public static void main(String[] args) {
        //        int[] array = {64, 34, 25, 12, 22, 11, 90};
        //
        //        System.out.println("Original:");
        //        RecursiveInsertionSort.printArray(array);
        //
        //        RecursiveInsertionSort.insertionSort(array);
        //
        //        System.out.println("Ordenado:");
        //        RecursiveInsertionSort.printArray(array)
    }
}

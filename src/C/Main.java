package C;

import java.util.Scanner;

public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int n = input.nextInt();
            int[] num = new int[n];
            for (int j = 0; j < n; j++) {
                num[j] = input.nextInt();
            }
            int[] res = classify(num);
            int odd = res[0];
            int even = res[1];
            if (odd % 2 != 0) {
                System.out.println(0);
                continue;
            }
            long ans = 0;
            for (int j = 0; j <= even; j++) {
                ans = (ans + combinatorial(even, j)) % mod;
            }
            long ans2 = 0;
            for (int j = 0; j <= odd; j += 2) {
                ans2 = (ans2 + combinatorial(odd, j)) % mod;
            }
            long total = (ans * ans2) % mod;
            System.out.println(total);
        }
    }

    public static int[] classify(int[] arr) {
        int odd = 0; // 奇数
        int even = 0; // 偶数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] res = {odd, even};
        return res;
    }


    public static long qpow(long x, long n) { // 快速幂，求 x 的 n 次方
        long res = 1;
        for (; n >= 1; n >>= 1, x = x * x % mod) {
            if ((n & 1) == 1) {
                res = res * x % mod;
            }
        }
        return res;
    }

    public static long combinatorial(int n, int r) { // 费小马定理
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i % mod;
        }
        for (int i = 1; i <= r; i++) {
            res = res * qpow(i, mod - 2) % mod;
        }
        for (int i = 1; i <= (n - r); i++) {
            res = res * qpow(i, mod - 2) % mod;
        }
        return res;
    }


}
package B;

public class Main {
    public static void main(String[] args) {
        //给出前十个数字了，所以从第十个数开始
        int count = 10;
        //数字从127开始进行无限循环
        for (int i = 127; ; i++) {
            //调用divide查看是否都符合条件
            if (divide(i, 2) == 0 &&
                    divide(i, 8) == 0 &&
                    divide(i, 10) == 0 &&
                    divide(i, 16) == 0) {
                //都符合了进行加1
                count++;
                //判断是否到达第2023个幸运数字
                if (count == 2023) {
                    System.out.println(i);
                }
            }
        }
    }

    public static int divide(int num, int v) {
        //定义
        int digits = 0;
        //接受传来的数值
        int n = num;
        //如果数值大于零
        while (num > 0) {
            //
            digits += num % v;
            num /= v;
        }
        //返回余数
        return n % digits;
    }
}
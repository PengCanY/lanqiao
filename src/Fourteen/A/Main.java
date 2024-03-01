package Fourteen.A;

public class Main {
    public static void main(String[] args) {
        //定义接受数据
                long total = 0;
                //循环30次
                for (int i = 1; i < 40; i++) {
                    //对每次循环结果进行取模防止数据过大溢出
                    total = (total + factorial(i)) % 1000000000;
                }
                //循环结束打印出结果
                System.out.println(total);

        }
        //此方法用于求单个数的阶乘
    public static long factorial(int i) {
        //定义接受数据
        long t = 1;
        //循环相乘次数
        for (int j = 1; j <= i; j++) {
            //从一到i-1相乘
            t = (t * j) % 1000000000;
        }
        return t;
    }
    }



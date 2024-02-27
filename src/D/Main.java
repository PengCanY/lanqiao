package D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x1 = input.nextInt();
        long y1 = input.nextInt();
        long x2 = input.nextInt();
        long y2 = input.nextInt();
        long x3 = input.nextInt();
        long y3 = input.nextInt();
        long x4 = input.nextInt();
        long y4 = input.nextInt();
        //求出总面积
        long s = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3);
        //减去有可能重叠的区域
        long z = s - check(x1,y1,x2,y2,x3,y3,x4,y4);
        System.out.println(z);
    }
    public static long check(long x1,long y1,long x2,long y2,long x3,long y3,long x4,long y4){
        long x = 0; // 如果没找到交集，设置为0，可以直接赋初值为0，然后只用找交集
        long y = 0;
        if (x1 > x3 && x1 < x4){ // 这里寻找x的交集区域
            x = x2 < x4? (x2 - x1):(x4 - x1);
        }else if (x2 > x3 && x2 < x4){
            x = x1 > x3? (x2 - x1):(x2 - x3);
        }
        if (y1 > y3 && y1 < y4){ // 这里寻找y的交集区域
            y = y2 < y4? (y2 - y1):(y4 - y1);
        }else if (y2 > y3 && y2 < y4){
            y = y1 > y3? (y2 - y1):(y2 - y3);
        }
        if (x == 0){ //  第一个矩形如果不在第二个矩形内部或者相交，考虑是否存在第二个矩形在第一个矩形内部的情况
            if (x3 > x1 && x3 < x2){ // 这里寻找x的交集区域
                x = x4 < x2? (x4 - x3):(x2 - x3);
            }else if (x4 > x1 && x4 < x2){
                x = x3 > x1? (x4 - x3):(x3 - x2);
            }
        }
        if (y == 0){
            if (y3 > y1 && y3 < y2){ // 这里寻找x的交集区域
                y = y4 < y2? (y4 - y3):(y2 - y3);
            }else if (y4 > y1 && y4 < y2){
                y = y3 > y1? (y4 - y3):(y3 - y2);
            }
        }

        return x*y;
    }
}

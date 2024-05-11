package Fourteen.test;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int jieru = scan.nextInt();
        while(jieru-->0){
            int n = scan.nextInt();
            int a,b;
            a=b=0;
            for(int i=0;i<n;i++){
                int r = scan.nextInt();
                if(r%2==1){
                    a++;
                }else{
                    b++;
                }
            }
            long max =  1000000001L;
            if(a%2==1){
                System.out.println(0);
            }else{
                long ans = 0;
                for(int i=0;i<a-1;i++){
                    ans*=2;
                    ans%=max;
                }
                for(int i=0;i<b;i++){
                    ans*=2;
                    ans%=max;
                }
                System.out.println(ans);
            }
        }
        scan.close();
    }
}
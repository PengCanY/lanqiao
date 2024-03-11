package other.one;

import java.util.Scanner;

public class Main {
    static int a = 0;
    static int num1 = 0;
    static int num2 = 0;
    static int id = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        id = sc.nextInt();
        //在此输入您的代码...
        dfs(num1,num2,id);
        System.out.println(a);
        sc.close();
    }

    //num1 1号糖果剩余
    //num2 2号糖果剩余
    //id 代表当前学生编号
    static void dfs(int num1,int num2,int id){

        if(id>7){
            if(num1 ==0 && num2 == 0){
                a++;
            }
            return;
        }
        for(int i = 0;i<=num1;i++){
            for(int j =0;j<=num2;j++){
                if(i+j>=2&&i+j<=5){
                dfs(num1-i,num2-j,id+1);
             }
            }
        }
    }

}
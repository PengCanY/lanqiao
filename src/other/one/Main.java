package other.one;

public class Main {
    static int a = 0;
    public static void main(String[] args) {
        //在此输入您的代码...
        dfs(9,16,1);
        System.out.println(a);
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
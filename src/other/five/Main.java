package other.five;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] nums = {0};
        int[] ints = moveZeroes(nums);
        System.out.println(Arrays.toString(ints));

    }
    public static int[] moveZeroes(int[] nums){
     //先判断是否为空
        if(nums == null ){
            return nums;
        }
        //定义一个指针
        int j = 0;
        //遍历数组查看非零个数
        for(int i=0;i<nums.length;++i){
         if(nums[i] != 0){
             //将非零的数赋值给j
           nums[j++] = nums[i];
         }
        }
        //将j后面的数赋值为0
        for(int i=j;i<nums.length;++i){
          nums[i] = 0;
        }
        return nums;
    }
}

import java.util.Arrays;

/**
 * @Description 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 *              数组中某些数字是重复的，但不知道有几个数字是重复的，也不知
 *              道每个数字重复几次。请找出数组中任意一个重复的数字。
 *              Input:
 *              {2, 3, 1, 0, 2, 5}
 *              Output:
 *              2
 * @Date  2020/6/6
 * @Author gongjiamin
 **/
public class Ex002 {
    public static void main(String[] args) {
        int[] nums={2, 3, 1, 0, 2, 5};
        System.out.println(repeat(nums));
    }
    static int repeat(int[] nums){
        for (int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                if (nums[i]==nums[nums[i]]){
                    System.out.println(Arrays.toString(nums));
                    return nums[i];
                }else {
                    int k=nums[i];
                    int j=k;
                    nums[i]=nums[k];
                    nums[k]=j;
                }
            }

        }
        return -1;
    }

}

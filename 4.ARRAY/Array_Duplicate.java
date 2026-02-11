public class Array_Duplicate {

    static void main() {
        int[] nums = {4,3,0,7,8,0,3,1,0};

        int index = 0;
        int start = 0;
        int end = nums.length-1;

       int[] copy = new int[nums.length];

        while(start<end){
            if(nums[index]==0){
                copy[end--] = nums[index];
            }else{
                copy[start++] = nums[index];
            }
            index++;
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

}

class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int prev=i-1;
            int curr=nums[i];

            while(prev>=0 && nums[prev]>curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;
        }
        return nums;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int ele =0;
        int n=nums.length;
        int cnt=0;

        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                ele=nums[i];
            }
            else if(nums[i]==ele){
                    cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt2=0;
        for(int j=0;j<n;j++){
            if(nums[j]==ele){
                cnt2++;

            } 
            if(cnt2>n/2)
             return ele;
        }
        return -1;



    }
}
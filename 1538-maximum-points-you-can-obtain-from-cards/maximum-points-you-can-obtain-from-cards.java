class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rSum=0;
        int maxSum=0;
        int n=cardPoints.length;

        for(int i=0;i<=k-1;i++){
            leftSum=leftSum + cardPoints[i];
            maxSum=leftSum;

        }
        int rIndex=n-1;
        for(int i=k-1;i>=0;i--){
            leftSum=leftSum-cardPoints[i];
            rSum=rSum+cardPoints[ rIndex];
            rIndex--;
            maxSum=Math.max(maxSum,leftSum+rSum);
        }
     
        return maxSum;

    }
}
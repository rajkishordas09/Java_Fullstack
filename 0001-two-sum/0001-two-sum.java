class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []arr = new int[2];
        int n = nums.length;
        l1:for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break l1;
                }
                
            }
        }
        return arr;
    }
}
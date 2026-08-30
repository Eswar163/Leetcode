class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minwindow=Integer.MAX_VALUE;
        int currentsum=0;
        int low=0;
        int high =0;
        while(high<nums.length){
            currentsum+=nums[high];
            high++;
            while(currentsum>=target){
                int currentwindowsize=high-low;
                minwindow=Math.min(minwindow,currentwindowsize);
                currentsum-=nums[low];
                low++;
            }
        }
        return minwindow==Integer.MAX_VALUE?0:minwindow;
    }
}
class Solution {
    
        int findmax(int[] piles){
        int max=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
        }
        int totalhr(int[] piles,int speed){
            int totalhr=0;
            for(int i=0;i<piles.length;i++){
                totalhr+=Math.ceil((double)piles[i]/speed);
            }
            return totalhr;
        }
       
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = findmax(piles);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int totalh = totalhr(piles, mid);

            if (totalh <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
class Solution {
    int findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    int divisonsum(int[] arr,int divisor){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=Math.ceil((double)arr[i]/divisor);
        }
        return totalsum;
    }
    public int smallestDivisor(int[] arr, int threshold) {
       int low=1;
       int high=findmax(arr);
       int ans=-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        int total=divisonsum(arr,mid);
        if(total<=threshold){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
       } 
       return ans;
    }
}
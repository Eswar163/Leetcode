class Solution {
    int findmin(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
     } 
     int findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
     }  
     boolean possible(int[] arr,int day,int m,int k){
        int count=0;
        int noOfDays=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }else{
                noOfDays+=count/k;
                count=0;
            }
     } 
        noOfDays += count / k;
        if(noOfDays>=m){
            return true;
        }else{
            return false;
        }
     }
    public int minDays(int[] arr, int m, int k) {
     int low=findmin(arr);
     int high=findmax(arr);
     int ans=-1;
     while(low<=high){
        int mid=low+(high-low)/2;
        if(possible(arr,mid,m,k)==true){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
     }
     return ans;//or return low; no prblm becoz opposite polarity condition arises
    }
}
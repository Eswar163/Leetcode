class Solution {
    int findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    int findsum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    int finddays(int[] arr, int capacity){
        int day=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>capacity){
                day+=1;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] arr, int days) {
        int low=findmax(arr);
        int high=findsum(arr);
        while(low<=high){
            int mid=low+(high-low)/2;
            int noOfdays=finddays(arr,mid);
            if(noOfdays<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
class Solution {
    int findmax(int[] arr){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                max=Math.max(max,arr[i]);
            }
            return max;
        }
    long findsum(int[] arr){
            long sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;
        }
    long helperfuncn(int[] arr,long sum){
            long subarray=1;
            long currentsum=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]+currentsum<=sum){
                    currentsum+=arr[i];
                }else{
                    subarray++;
                    currentsum=arr[i];
                }
            }
            return subarray;
        }
        
    public int splitArray(int[] arr, int k) {
      long low=findmax(arr);
      long high=findsum(arr);
      while(low<=high){
        long mid=low+(high-low)/2;
        long noOfarrays=helperfuncn(arr,mid);
        if(noOfarrays>k){
            low=mid+1;
        }else{
            high=mid-1;
        }
      }
      return (int) low;
    }
}
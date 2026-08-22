class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    void mergesort(int[] arr,int low, int high){
        if(low>=high){
            return;
        }
            int  mid=low+(high-low)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);

    }
    void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[arr.length];
        int left=low;
        int right=mid+1;
        int k=low; //also use k=0 but small change in for loop
        while(left<=mid&& right<=high){
            if(arr[left]<arr[right]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
            while(left<=mid){
                temp[k]=arr[left];
                left++;
                k++;
            }
            while(right<=high){
                temp[k]=arr[right];
                right++;
                k++;
            }
        
        for(int i=low;i<=high;i++){
            arr[i]=temp[i]; //if k=0 use temp[i-low]
        }

    }
}

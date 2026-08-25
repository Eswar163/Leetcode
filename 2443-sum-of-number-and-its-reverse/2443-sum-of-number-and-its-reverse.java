class Solution {
    int sum=0;
    int reverse(int n){
        if(n==0){
            return sum ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        return reverse(n/10);
    }
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            sum=0;
            int rev=reverse(i);
            if(i+rev==num){
                return true;
            }

        }
        return false;
    }
}
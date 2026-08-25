class Solution {
    int sum=0;
    int rev(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
        return rev(n/10);
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        return x==rev(x);
    }
}
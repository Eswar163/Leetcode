class Solution {
     public boolean isvowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
       int l=0;
       int r=arr.length-1;
       while(l<r){

        
        if (!isvowel(arr[l])) {
             l++;
        }
       else if (!isvowel(arr[r])) {
               r--;
        }
        else{
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }


    
        
       } 
       return new String(arr);
    }
}
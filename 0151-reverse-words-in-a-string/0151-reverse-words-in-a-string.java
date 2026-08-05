class Solution {
    public String reverseWords(String s) {    StringBuilder sb=new StringBuilder();
        String[] ans = s.trim().split("\\s+");
        int start=0;
        int end=ans.length-1;
         while(start<end){
            String temp=ans[start];
            ans[start]=ans[end];
            ans[end]=temp;
            start++;
            end--;
         }   
        for(int i=0;i<ans.length;i++){
            sb.append(ans[i]);
            if(i!=ans.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
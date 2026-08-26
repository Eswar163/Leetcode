class Solution {
    public String addBinary(String a, String b) {
       int i=a.length()-1;
       int j=b.length()-1;
       int carry=0;
       StringBuilder result=new StringBuilder();
       while(i>=0||j>=0||carry>0){
        int digit1=0;
        int digit2=0;
        if(i>=0){
            digit1=a.charAt(i)-'0';
        }
        if(j>=0){
            digit2=b.charAt(j)-'0';
        }
        int sum=digit1+digit2+carry;
        int digit=sum%2;
        carry=sum/2;
        result.append(digit);
        i--;
        j--;

       }  
       return result.reverse().toString();
    }
}
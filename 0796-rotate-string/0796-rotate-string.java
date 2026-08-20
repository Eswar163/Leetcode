class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
      for(int i=0;i<s.length();i++){
        String prefix=s.substring(0,i);
        String suffix=s.substring(i);
        String rotated=suffix+prefix;
        if(rotated.equals(goal)){
            return true;
        }
      }
      return false;
    }
}
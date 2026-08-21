class Solution {
    public String frequencySort(String s) {
      int[] freq=new int[256];
      for(int i=0;i<s.length();i++){
        freq[s.charAt(i)]++;
      }  
      StringBuilder ans=new StringBuilder();
      for(int count=0;count<256;count++){
        int maxfreq=0;
        int maxchar=0;
        for(int i=0;i<256;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                maxchar=i;
            }
        }
        if(maxfreq==0){
            break;
        }
        for(int i=0;i<maxfreq;i++){
            ans.append((char) maxchar);
        }
        freq[maxchar]=0;
      }

      return ans.toString();
    }
}
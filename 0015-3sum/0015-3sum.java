class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int third=-(arr[i]+arr[j]);
                if(set.contains(third)){
                    List<Integer> triplet=Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(triplet);
                    ans.add(triplet);
                }
                set.add(arr[j]);
            }
        }
        return new ArrayList<>(ans);
        

    }
}
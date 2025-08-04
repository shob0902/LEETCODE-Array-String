class Solution {
    public int removeDuplicates(int[] n) {
        int j=2;
        for(int i=2;i<n.length;i++){
            if(n[i]!=n[j-2]){
                n[j]=n[i];
                j++;
            }
        }
        return j;
    }
}

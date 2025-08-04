class Solution {
    public int majorityElement(int[] n) {
        for(int i=0;i<n.length;i++){
            int c=0;
            for(int j:n){
                if(j==n[i])c++;
            }
            if(c>n.length/2){
                return n[i];
            } 
        }   
        return -1;
    }
}

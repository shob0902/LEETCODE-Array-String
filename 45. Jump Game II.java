class Solution {
    public int jump(int[] n) {
        int j=0,c=0,f=0;
        for(int i=0;i<n.length-1;i++){
            f=Math.max(f,i+n[i]);
            if(i==c){
                j++;
                c=f;
            }
        }
        return j;
    }
}

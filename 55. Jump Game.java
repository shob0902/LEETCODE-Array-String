class Solution {
    public boolean canJump(int[] n) {
        int g=n.length-1;
        for(int i=n.length-2;i>=0;i--){
            if(i+n[i]>=g){
                g=i;
            }
        }
        return g==0;
    }
}

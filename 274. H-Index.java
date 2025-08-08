class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] a=new int[n+1];
        for(int c:citations){
            if(c>=n){
                a[n]++;
            }else{
                a[c]++;
            }
        }
        int count=0;
        for(int i=n;i>0;i--){
            count+=a[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}

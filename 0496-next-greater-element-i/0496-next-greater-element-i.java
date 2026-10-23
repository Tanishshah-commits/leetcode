class Solution {
    public int find(int[] a,int b){
        for(int i = b+1;i<a.length;i++){
            if(a[i]>a[b]){
                return a[i];
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int l = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        for(int i = 0;i<nums1.length;i++){
            int a = map.get(nums1[i]);
            ans[l] = find(nums2,a);
            l++;
        }
        return ans;
    }
}
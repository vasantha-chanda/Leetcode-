class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int intArr[] =new int[nums1.length];
        int i=0,j=0,k=0;
      while(i<m && j<n){
          if(nums1[i]<=nums2[j]){
             intArr[k]=nums1[i];
              k++;
              i++;
          }
          else{
              intArr[k]=nums2[j];
              k++;
              j++;
          }
      }
           while(i < m){
            intArr[k] = nums1[i];
            k++;
            i++;
        }
        while(j < n){
            intArr[k] = nums2[j];
            k++;
            j++;
        }
    for(int v=0;v<nums1.length;v++){
        nums1[v]=intArr[v];
    }
            
    }
}
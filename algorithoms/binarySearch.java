/* Binary search can be made using 2 approaches
1. Recursive approach
2. Iterative approach

both have same time complexity but space complexity of recursive O(log N) > iterative O(1)
*/

// ------------- Recursive Approach ------------------- //
class Solution {
    
    public int binarySearch(int[] A, int start , int end , int target) {
        if( end >= start) {
            int l = end - start;
            int index = l/2+start;
            if(A[index] == target) {
                return index;
            } else if(A[index] > target) {
                end = index-1;
                return binarySearch(A , start , end , target );
            } else {
                start = index +1 ;
                return binarySearch(A , start , end , target);
            }
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        return binarySearch(nums , 0 , nums.length-1 , target);
    }
    
}

// ------------- Iterative Approach ------------------- //
class Solution {
    

    public int search(int[] nums, int target) {
        
        int low = 0 , high = nums.length - 1;
        while( low <= high ) {
            
            int index = low + (high-low)/2;
            
            if( nums[index] == target) {
                return index;
            } else if(nums[index] > target) {
                high = index - 1;
            } else {
                low = index + 1;
            }           
        }
        return -1;
        
    }
    
}
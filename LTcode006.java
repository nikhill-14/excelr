public class LTcode006 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int k = 1;  // Start counting unique elements from the second position
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];  // Move the unique element to the next available position
                k++;  // Increment the count of unique elements
            }
        }
        
        return k;  // Return the number of unique elements
    }
}

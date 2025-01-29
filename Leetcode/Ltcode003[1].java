public class Ltcode003 {
    public class Solution {
        public int myAtoi(String s) {
            // Step 1: Strip leading whitespaces
            s = s.trim();
    
            // If the string is empty after trimming, return 0
            if (s.isEmpty()) {
                return 0;
            }
    
            // Step 2: Handle sign
            int sign = 1;
            int index = 0;
            
            if (s.charAt(index) == '-') {
                sign = -1;
                index++;
            } else if (s.charAt(index) == '+') {
                index++;
            }
    
            // Step 3: Convert digits to integer
            long result = 0;
            while (index < s.length() && Character.isDigit(s.charAt(index))) {
                result = result * 10 + (s.charAt(index) - '0');
                index++;
                
                // Check for overflow/underflow during conversion
                if (result * sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                if (result * sign > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }
    
            // Apply the sign and return the final result
            return (int) (result * sign);
        }
    }
    
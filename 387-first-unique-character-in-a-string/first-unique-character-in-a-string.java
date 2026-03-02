import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> mp = new HashMap<>();
        
        // Step 1: Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        // Step 2: Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
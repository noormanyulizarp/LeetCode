public class MinimumWindowSubstring {
    // Function to find the minimum window substring
    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] dictT = new int[128]; // Character count for t
        for (char c : t.toCharArray()) {
            dictT[c]++;
        }

        int required = t.length(); // Number of unique characters in t
        int l = 0, r = 0; // Left and right pointer
        int[] formed = new int[128]; // Current character count in the window
        int minLen = Integer.MAX_VALUE; // Minimum length of the window
        int minLeft = 0; // Left index of the minimum window

        while (r < s.length()) {
            char c = s.charAt(r);
            formed[c]++; // Add character from the right pointer
            if (formed[c] <= dictT[c]) {
                required--;
            }

            // Try to contract the window until it ceases to be 'desirable'
            while (required == 0) {
                // Update the minimum window
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minLeft = l;
                }

                char leftChar = s.charAt(l);
                formed[leftChar]--; // Remove character from the left pointer
                if (formed[leftChar] < dictT[leftChar]) {
                    required++;
                }
                l++; // Move left pointer to the right
            }
            r++; // Move right pointer to the right
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println("Minimum window substring: " + result); // Output: "BANC"
    }
}
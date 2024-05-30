/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.



Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 */

class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int maxVowels = countInitialVowels(s, vowels, k);
        int currVowels = maxVowels;

        for (int i = k; i < s.length(); i++) {
            char curr = s.charAt(i);
            char toRemove = s.charAt(i - k);

            if (vowels.contains(curr)) currVowels++;
            if (vowels.contains(toRemove)) currVowels--;

            maxVowels = Math.max(maxVowels, currVowels);
        }
        return maxVowels;
    }

    private int countInitialVowels(String s, Set<Character> vowels, int limit) {
        int vowelCount = 0;
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            if (vowels.contains(c))
                vowelCount++;
        }
        return vowelCount;
    }
}
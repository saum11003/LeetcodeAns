class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder mergedString = new StringBuilder();
        
        int i = 0;
        while (i < len1 || i < len2) {
            if (i < len1) {
                mergedString.append(word1.charAt(i));
            }
            if (i < len2) {
                mergedString.append(word2.charAt(i));
            }
            i++;
        }
        
        return mergedString.toString();
    }
}

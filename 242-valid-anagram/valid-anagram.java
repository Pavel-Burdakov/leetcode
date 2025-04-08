class Solution {
    public boolean isAnagram(String s, String t) {
        char[]sCharArray = s.toCharArray();
        char[]tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        boolean res = Arrays.equals(sCharArray, tCharArray);
        return res;
    }
}
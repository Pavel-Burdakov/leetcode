class Solution {
    public boolean detectCapitalUse(String word) {
        String up = word.toUpperCase();
        String low = word.toLowerCase();
        String firstUp = word.substring(0,1).toUpperCase() + word.substring(1, word.length()).toLowerCase();
        System.out.println (firstUp);
        if (up.equals(word)||low.equals(word)||firstUp.equals(word)){
            return true;
        }
        return false;
    }
}
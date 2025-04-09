class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l = p.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<=s.length()-p.length(); i++){
            if (isAnagram(s.substring(i, i+l), p)){
                list.add(i);
            }
            
        }
        return list;
        
    }

    private boolean isAnagram(String s, String t){
        int count [] = new int[26];
        for (int i=0; i<t.length(); i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for (int i=0; i<count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
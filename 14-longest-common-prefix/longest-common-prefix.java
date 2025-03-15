class Solution {
    public String longestCommonPrefix(String[] strs) {
        // сортируем массив по возрастанию, чтобы самые короткие строки были вначале    
        Arrays.sort(strs);
        // в s1 - первая самая короткая строка
        String s1 = strs[0];
        // в s2 последняя самая длиная
        String s2 = strs[strs.length-1];
        // сюда будем записывать количество первых одинаковых элементов
        int idx = 0;
        while(idx < s1.length()){
            if (s1.charAt(idx) == s2.charAt(idx)){
              idx++;
            } else break;
        }
        return s1.substring(0, idx);    
    }
}
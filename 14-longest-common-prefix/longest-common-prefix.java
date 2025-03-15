class Solution {
    public String longestCommonPrefix(String[] strs) {        
        Arrays.sort(strs); // сортируем массив по возрастанию, чтобы самые короткие строки были вначале        
        String s1 = strs[0]; // в s1 - первая самая короткая строка   
        String s2 = strs[strs.length-1]; // в s2 последняя самая длиная  
        int idx = 0; // сюда будем записывать количество первых одинаковых элементов
        while(idx < s1.length()){
            if (s1.charAt(idx) == s2.charAt(idx)){
              idx++;
            } else break;
        }
        return s1.substring(0, idx);    
    }
}
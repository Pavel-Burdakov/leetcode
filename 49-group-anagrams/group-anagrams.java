class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        // Ключом HashMap будет слово отсортированное по возрастнию
        // Все слова, при сортировке букв которых получаем одинаковый набор символов будут анаграммами
        for (String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            // Если после сортировки символов в очередном элементе массива не находится запись с таким ключом, то создаем ее
            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            // К массиву находящемуся по найденному ключу дописываем строку
            map.get(key).add(s);

        }
        // Из значений HashMap достаем искомый List
        return new ArrayList<>(map.values());
    }
}
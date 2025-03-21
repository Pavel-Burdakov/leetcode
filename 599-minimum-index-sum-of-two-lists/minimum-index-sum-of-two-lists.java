class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> minIdxStrings = new ArrayList<>();
        int minIdxSum = list1.length + list2.length;
        int[] sums = new int[list1.length];
        for(int i=0; i<list1.length; i++) {
            for(int j=0; j<list2.length; j++) {
                if(list1[i].equals(list2[j]) && i+j+2 <= minIdxSum) {
                    minIdxSum = i+j+2;
                    sums[i] = i+j+2;
                    break;
                }
            }
        }

        for(int i=0; i<sums.length; i++) {
            if(sums[i] > 1 && sums[i]==minIdxSum) {
                minIdxStrings.add(list1[i]);
            }
        }
        return minIdxStrings.stream().toArray(String[]::new);
    }
}
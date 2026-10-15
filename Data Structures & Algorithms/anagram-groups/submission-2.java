class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap, List<String>> charCount = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {

            HashMap<Character, Integer> tempHashMap = new HashMap<>();
            if (strs[i].length() == 0) {
                tempHashMap.put('\0', 1);
            }
            for (int j = 0; j < strs[i].length(); j++) {
                tempHashMap.put(strs[i].charAt(j), tempHashMap.getOrDefault(strs[i].charAt(j), 0) + 1);
            }

            charCount.computeIfAbsent(tempHashMap, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(charCount.values());
    }
}
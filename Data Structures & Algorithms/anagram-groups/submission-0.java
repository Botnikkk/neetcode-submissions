class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> answer = new ArrayList();
        HashMap<Integer, HashMap> charCount = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> tempHashMap = new HashMap<>();
            if (strs[i].length() == 0) {
                tempHashMap.put('\0', 1);
            }
            for (int j = 0; j < strs[i].length(); j++) {
                tempHashMap.put(strs[i].charAt(j), tempHashMap.getOrDefault(strs[i].charAt(j), 0) + 1);
            }
            charCount.put(i, tempHashMap);
        }


        for (int n = 0; n < charCount.size(); n++) {

            List<String> tempList = new ArrayList();
            if (!(charCount.get(n).isEmpty())) {
                tempList.add(strs[n]);
                for (int m = n + 1; m < charCount.size(); m++) {
                    if (!(charCount.get(m).isEmpty())) {
                        if (charCount.get(m).equals(charCount.get(n))) {
                            tempList.add(strs[m]);
                            charCount.get(m).clear();

                        }
                    }
                }
                answer.add(tempList);
                charCount.get(n).clear();
            }

        }

        return answer;
    }
}
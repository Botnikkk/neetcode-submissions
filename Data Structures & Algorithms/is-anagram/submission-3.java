class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sLetterCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tLetterCount = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            if(sLetterCount.containsKey(s.charAt(i))){
                sLetterCount.put(s.charAt(i), (sLetterCount.get(s.charAt(i)) + 1) );
            }else{
                sLetterCount.put(s.charAt(i), 1);
            }

            if(tLetterCount.containsKey(t.charAt(i))){
                tLetterCount.put(t.charAt(i),(tLetterCount.get(t.charAt(i)) + 1));
            }else{
                tLetterCount.put(t.charAt(i), 1);
            }
        }
        
        return tLetterCount.equals(sLetterCount);
    }
}

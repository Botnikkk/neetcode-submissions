class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sLetterCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tLetterCount = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            if(sLetterCount.containsKey(s.charAt(i))){
                sLetterCount.put(s.charAt(i), (sLetterCount.get(s.charAt(i)) + 1) );
            }else{
                sLetterCount.put(s.charAt(i), 1);
            }
        }
        for(int j=0; j<t.length();j++){
            if(tLetterCount.containsKey(t.charAt(j))){
                tLetterCount.put(t.charAt(j),(tLetterCount.get(t.charAt(j)) + 1));
            }else{
                tLetterCount.put(t.charAt(j), 1);
            }
        }
        if(tLetterCount.equals(sLetterCount)){
            return true;
        }
        return false;
    }
}

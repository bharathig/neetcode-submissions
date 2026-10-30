class Solution {
    public boolean isAnagram(String s, String t) {

       
       
       Map<Character, Integer> charCountHashMap = new HashMap();
       
       
       for(char c : s.toCharArray()){
charCountHashMap.put(c,charCountHashMap.getOrDefault(c,0)+1);

       }

  for(char c : t.toCharArray()){
    if(!charCountHashMap.containsKey(c)){
        return false;
    }
charCountHashMap.put(c,charCountHashMap.get(c)-1);

if(charCountHashMap.get(c) == 0){
    charCountHashMap.remove(c);
}

       }
      return charCountHashMap.isEmpty();

    }
}

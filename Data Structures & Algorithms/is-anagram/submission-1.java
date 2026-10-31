class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] firstInput = s.toCharArray();
        char[] secondInput = t.toCharArray();

        if(s.length() == t.length()){
            Arrays.sort(firstInput);
            Arrays.sort(secondInput);
            return Arrays.equals(firstInput, secondInput);
        }
        
        return false;
    }
}

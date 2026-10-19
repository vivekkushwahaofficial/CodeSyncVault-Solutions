class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int length = 0;
        boolean odd = false;

        for(int freq : map.values()){
            length += (freq /2) * 2;
            if(freq % 2 != 0){
                odd = true;
            }
        }
        if(odd) length++;
        return length;
    }
}
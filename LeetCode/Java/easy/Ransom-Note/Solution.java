class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = ransomNote.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            char ch = magazine.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }
        for (char ch : need.keySet()) {
            if (have.getOrDefault(ch, 0) < need.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
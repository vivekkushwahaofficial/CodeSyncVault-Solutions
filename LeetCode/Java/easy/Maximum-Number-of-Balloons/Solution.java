class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int answer = Integer.MAX_VALUE;
        answer = Math.min(answer, map.getOrDefault('b', 0));
        answer = Math.min(answer, map.getOrDefault('a', 0));
        answer = Math.min(answer, map.getOrDefault('l', 0) / 2);
        answer = Math.min(answer, map.getOrDefault('o', 0) / 2);
        answer = Math.min(answer, map.getOrDefault('n', 0));
        return answer;
    }
}
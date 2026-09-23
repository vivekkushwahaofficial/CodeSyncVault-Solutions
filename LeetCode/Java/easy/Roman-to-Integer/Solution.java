class Solution {
   public int romanToInt(String s) {
    int result = 0;

    for (int i = 0; i < s.length(); i++) {
        int current = value(s.charAt(i));

        if (i + 1 < s.length()) {
            int next = value(s.charAt(i + 1));

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        } else {
            result += current;
        }
    }

    return result;
}

private int value(char ch) {
    return switch (ch) {
        case 'I' -> 1;
        case 'V' -> 5;
        case 'X' -> 10;
        case 'L' -> 50;
        case 'C' -> 100;
        case 'D' -> 500;
        case 'M' -> 1000;
        default -> 0;
    };
}
}
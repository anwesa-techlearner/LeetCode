class Solution {
    public boolean isValid(String s) {
          int length = s.length();
        if (length % 2 != 0) {
            return false;
        }

        char[] stack = new char[length];
        int head = 0;

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack[head++] = ')';
            } else if (c == '[') {
                stack[head++] = ']';
            } else if (c == '{') {
                stack[head++] = '}';
            } else if (head == 0 || stack[--head] != c) {
                return false;
            }
        }

        return head == 0;  
    }
}
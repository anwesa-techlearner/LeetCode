class Solution {
    public int reverse(int x) {
        long a = 0;  // use long to check overflow
        while (x != 0) {
            a = a * 10 + (x % 10);
            x /= 10;
        }
        // check 32-bit range
        if (a > Integer.MAX_VALUE || a < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) a;
    }
}

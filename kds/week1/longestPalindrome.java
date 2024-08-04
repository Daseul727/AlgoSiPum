package kds.week1;

public class longestPalindrome {
    static int left = 0;
    static int maxLen = 0;
    public static void main(String[] args) {
        String s = "babad";
        checkPalindrome(s);
    }
    public static String checkPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;

        for (int i=0; i<len-1 ; i++) {
            checkPalin(s, i, i+1);
            checkPalin(s, i, i+2);
        }

        return s.substring(left, left + maxLen);
    }

    public static void checkPalin(String s, int j, int k) {
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j --;
            k ++;
        }

        if (maxLen < k - j - 1) {
            left = j + 1;
            maxLen = k - j - 1;
        }
    }
}


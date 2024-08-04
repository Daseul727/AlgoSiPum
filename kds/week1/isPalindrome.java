package kds.week1;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String reverse = new StringBuilder(s).reverse().toString();

        return str.equals(reverse);
    }
}

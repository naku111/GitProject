package Leetcode;

public class Problem05 {
    //最长回文字串
    //中心扩散法
    public static String longestPalindrome1(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }
        int strLen = s.length();
        int left = 0;
        int right = 0;
        int len = 1;
        int maxStart = 0;
        int maxLen = 0;

        for (int i = 0; i < strLen; i++) {
            left = i - 1;
            right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            while (right < strLen && s.charAt(right) == s.charAt(i)) {
                len++;
                right++;
            }
            while (left >= 0 && right < strLen && s.charAt(right) == s.charAt(left)) {
                len = len + 2;
                left--;
                right++;
            }
            if (len > maxLen) {
                maxLen = len;
                maxStart = left;
            }
            len = 1;
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);
        //substring(int beginIndex, int endIndex)：
        //返回从索引 beginIndex 开始，直到 endIndex - 1 位置的子字符串（endIndex 不包括在内）。
    }

    public static void main(String[] args) {
        String string = longestPalindrome1("babad");
        System.out.println(string);
    }
}

package Leetcode;

public class problem844 {
    //比较含退格的字符串
    public static boolean backspaceCompare_AC(String S, String T) {
        //从后往前找，每次找到一个字符然后比较，不相等即返回false
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
    }
    public  static boolean backspaceCompare(String s, String t) {
        StringBuilder ssb = new StringBuilder(); // 模拟栈
        StringBuilder tsb = new StringBuilder(); // 模拟栈
        // 分别处理两个 String
        for (char c : s.toCharArray()) {
            if (c != '#') {
                ssb.append(c); // 模拟入栈
            } else if (ssb.length() > 0){ // 栈非空才能弹栈
                ssb.deleteCharAt(ssb.length() - 1); // 模拟弹栈
            }
        }
        for (char c : t.toCharArray()) {
            if (c != '#') {
                tsb.append(c); // 模拟入栈
            } else if (tsb.length() > 0){ // 栈非空才能弹栈
                tsb.deleteCharAt(tsb.length() - 1); // 模拟弹栈
            }
        }
        return ssb.toString().equals(tsb.toString());
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }
}

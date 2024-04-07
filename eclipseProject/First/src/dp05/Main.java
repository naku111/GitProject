package dp05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public class T3152 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int[] dp = new int[11]; // 这个表示以某个数字结尾的最长子序列的长度
	        // 可能以0结尾
	        for (int i = 0; i < n; i++) {
	            String s = arr[i] + "";
	            int head = s.charAt(0) - '0'; // 表示此时的头是什么数
	            int tail = s.charAt(s.length() - 1) - '0'; // 表示此时的尾是什么数
	            // 以tail结尾的最长子序列的长度，就是以head结尾的最长子序列的长度+1
	            // 为啥是呢，是因为自己的头符合别人的尾了，此时自己的头实际上是最长序列的尾，所以要找一个更长的值啊
	            // 自己的头符合条件的话，就相当于以自己头结尾的值要+1
	            dp[tail] = Math.max(dp[tail], dp[head] + 1);
	        }
//	        System.out.println(Arrays.toString(dp));
	        Arrays.sort(dp);
//	        System.out.println(Arrays.toString(dp));
	        System.out.println(n - dp[10]);
	    }
	}

}

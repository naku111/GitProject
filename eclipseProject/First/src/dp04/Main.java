package dp04;

public class Main {

	public static void main(String[] args) {
		// leetcode.343
		System.out.println(integerBreak(10));
	}
	public static  int integerBreak(int n) {
	        int[] dp=new int[n+1];
	        dp[2]=1;
	        for(int i=3;i<=n;i++){
	            for(int j=1;j<i;j++){
	                dp[i]=max(j*(i-j),j*dp[i-j],dp[i]);
	            }
	        }
	        return dp[n];
	  }
	public static int max(int a,int b,int c) {
		int max=a>b ? a:b;
		max=max>c ? max:c;
		return max;
	}
}

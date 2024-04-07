package gcd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=gcd(4, 6);
		int b=lcm(10, 3);
		System.out.println(a);
		System.out.println(b);
	}
	public static int gcd(int x,int y) {
		return y==0 ? x:gcd(y, x%y);
	}
	public static int lcm(int x,int y) {
		return x*y/gcd(x, y);
	}
}

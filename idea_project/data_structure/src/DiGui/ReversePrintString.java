package DiGui;

public class ReversePrintString {
    public static void main(String[] args) {
        String a="dhfhsdkfhsd";
        reverse(a,0);
    }
    public static void reverse(String a,int n){
        if(n==a.length())
            return;
        reverse(a,n+1);
        System.out.println(a.charAt(n));
    }
}

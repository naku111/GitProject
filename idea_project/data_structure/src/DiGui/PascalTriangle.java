package DiGui;

public class PascalTriangle {
    private static int element(int i,int j){
        if(j==0||j==i)
            return 1;
        return element(i-1,j-1)+element(i-1,j);
    }
    private static void print(int n,int i){
        int num=2*(n-1-i);
        for (int j = 0; j < num; j++) {
            System.out.print(" ");
        }
    }
    public static void printTriangle(int n){
        for (int i = 0; i < n; i++) {
            print(n,i);
            for (int j = 0; j <=i; j++) {
                System.out.printf("%-4d",element(i,j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}

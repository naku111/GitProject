package DiGui;

public class PascalTriangle_02 {
    //记忆法
    private static int element(int[][] t,int i,int j){
        if(t[i][j]>0){
            return t[i][j];
        }
        if(j==0||j==i){
            t[i][j]=1;
            return t[i][j];
        }
        t[i][j]=element(t,i-1,j-1)+element(t,i-1,j);
        return t[i][j];
    }
    private static void print(int n,int i){
        int num=2*(n-1-i);
        for (int j = 0; j < num; j++) {
            System.out.print(" ");
        }
    }
    public static void printTriangle(int n){
        int[][] t=new int[n][];
        for (int i = 0; i < n; i++) {
            t[i]=new int[i+1];
            print(n,i);
            for (int j = 0; j <=i; j++) {
                System.out.printf("%-4d",element(t,i,j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}

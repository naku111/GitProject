package DiGui;

public class PascalTriangle_03 {
    private static void CreateRow(int[] row,int i){
        if(i==0)
        {
            row[0]=1;
            return;
        }
        for (int j = i; j>0; j--) {
            row[j]=row[j]+row[j-1];
        }
    }
    private static void print(int n,int i){
        int num=2*(n-1-i);
        for (int j = 0; j < num; j++) {
            System.out.print(" ");
        }
    }
    public static void printTriangle(int n){
        int[] row=new int[n];
        for (int i = 0; i < n; i++) {
            CreateRow(row,i);
            print(n,i);
            for (int j = 0; j <=i; j++) {
                System.out.printf("%-4d",row[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}

package DiGui;

public class BinarySearch {
    public static void main(String[] args) {
        int[] b={1,2,3,4,5,6};
        int c=search(b,5,0,b.length);
        System.out.println(c);
    }
    public static int search(int[] a,int target,int i,int j){
        if(i>j) {
            return -1;
        }
        int m=(i+j) >>>1;
        if (target<a[m]){
            return search(a,target,i,m-1);
        }
        else if (a[m]<target) {
            return search(a,target,m+1,j);
        }else{
            return m;
        }

    }
}

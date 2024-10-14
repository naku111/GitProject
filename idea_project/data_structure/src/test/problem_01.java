package test;

import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n and q
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        // Read array a
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        // Process each query
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            // Find the maximum length of a "good" interval in [l, r]
            int maxLength = 0;
            int start = l;
            int end=r;

            while (start <= end) {
                if(a[start]!=a[end]){
                    maxLength=Math.max(maxLength,end - start + 1);
                    break;
                }else {
                    while (start<=end){
                        start++;
                        if(a[start]!=a[end]){
                            maxLength=Math.max(maxLength,end - start + 1);
                            break;
                        }
                        start--;
                        end--;
                        if(a[start]!=a[end]){
                            maxLength=Math.max(maxLength,end - start + 1);
                            break;
                        }
                        end++;
                        start++;
                        end--;
                    }
                    break;
                }
            }

            System.out.println(maxLength);
        }
        scanner.close();
    }
}

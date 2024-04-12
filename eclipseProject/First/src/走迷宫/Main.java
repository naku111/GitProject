package 走迷宫;
import java.util.*;

public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n+1][m+1];
        boolean vis[][]=new boolean[n+1][m+1];
        Queue<Node> q=new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int startx=sc.nextInt();
        int starty=sc.nextInt();
        int endx=sc.nextInt();
        int endy=sc.nextInt();
        boolean success=false;
        vis[startx][starty]=true;
        q.offer(new Node(startx,starty,0));
        while (!q.isEmpty())
        {
            Node p=q.poll();
            int x1=p.x;
            int y1=p.y;
            int path1=p.path;
            if(x1==endx&&y1==endy) {
                System.out.println(path1);
                success=true;
            }
            else {
                for(int i=0;i<4;i++)
                {
                    int x2=x1+dx[i];
                    int y2=y1+dy[i];
                    if(x2>=1&&x2<=n&&y2>=1&&y2<=m)
                    {
                        if(a[x2][y2]==1&&!vis[x2][y2])
                        {
                            vis[x2][y2]=true;
                            q.offer(new Node(x2,y2,path1+1));
                        }
                    }
                }
            }
        }
        if(!success)System.out.println(-1);
    }

    private static class Node {
        private int x;
        private int y;
        private int path;
        public Node(int x, int y, int path) {
            this.x=x;
            this.y=y;
            this.path=path;
        }
    }
}

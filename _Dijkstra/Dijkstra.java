package suanfa._Dijkstra;

/**
 * @Author Li
 * @Date 20.4.8 16:01
 * @Version 1.0
 */


public class Dijkstra {
    static final int M = Integer.MAX_VALUE;

    public static void main(String[] args) {

        // 二维数组每一行分别是 A、B、C、D、E 各点到其余点的距离,
        // A -> A 距离为0, 常量M 为正无穷
        int[][] weight1 = {
                {0, 4, M, 2, M},
                {4, 0, 4, 1, M},
                {M, 4, 0, 1, 3},
                {2, 1, 1, 0, 7},
                {M, M, 3, 7, 0}
        };

        int start = 0;

        int[] shortPath = dijkstra(weight1, start);

        for (int i = 0; i < shortPath.length; i++)
            System.out.println("从" + start + "出发到" + i + "的最短距离为：" + shortPath[i]);
    }

    public static int[] dijkstra(int[][] weight, int start) {
        int n = weight.length;
        int[] visited = new int[n];
        int[] shortPath = new int[n];
        shortPath[start] = 0;
        visited[start] = 1;
        for (int count = 1; count < n; count++) {
            int k = -1;
            int dmin = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0 && dmin > weight[start][i]) {
                    dmin = weight[start][i];
                    k = i;
                }
            }
            shortPath[k] = dmin;
            visited[k] = 1;
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i]) {
                    weight[start][i] = weight[start][k] + weight[k][i];
                }
            }

        }
        return shortPath;
    }

}

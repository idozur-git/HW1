public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) return 0;

        int n = m.length;
        int[] distances = new int[n];
        for (int k = 0; k < n; k++) distances[k] = -1;
        
        int[] queue = new int[n];
        int head = 0, tail = 0;
        
        queue[tail++] = i;
        distances[i] = 0;

        while (head < tail){
            int curr = queue[head++];
            for (int neighbour = 0; neighbour < n; neighbour++){
                if (m[curr][neighbour] == 1 && distances[neighbour] == -1) {
                    distances[neighbour] = distances[curr] + 1;
                    if (neighbour == j) return distances[neighbour];
                    queue[tail++] = neighbour;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
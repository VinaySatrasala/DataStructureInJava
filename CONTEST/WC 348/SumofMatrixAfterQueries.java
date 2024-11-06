public class SumofMatrixAfterQueries {
    public static void main(String[] args) {
        int[][] queries = {{0,0,4},{0,1,2},{1,0,1},{0,2,3},{1,2,1}};
        System.out.println(matrixSumQueries(3, queries));
    }
    static long matrixSumQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];

        long sum = 0;

        for (int[] is : queries) {
            if(is[0] == 0){
                for (int i = 0; i < n; i++) {
                    sum -= mat[is[1]][i];
                    mat[is[1]][i] = is[2];
                    sum+=is[2];
                }
            }else{
                for (int i = 0; i < n; i++) {
                    sum -= mat[i][is[1]];
                    mat[i][is[1]] = is[2];
                    sum+=is[2];
                }
            }
        }


        return sum;
    }
}

package Matrix;

public class practice {
    public static void main(String[] args) {

        int[][] ans = {{1, 2, 3}, {4, 5, 6}, {6, 7, 8}};

        for (int i = 0; i < 3; i++) {
            int sum=0;
            for (int j = 0; j<3; j++){
                sum+=ans[i][j];
            }
            System.out.println(sum);
        }
    }
}

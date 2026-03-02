
public class MatrixSum {

	public static int matSum(int[][] mat) {
		int sum=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				sum+=mat[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] mat= {
				{1,2,3,4},
				{2,3,4,5},
				{6,7,8,9}
		};
		System.out.println(matSum(mat));

	}

}

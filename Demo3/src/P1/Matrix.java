package P1;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int r=0,c=0;
//		int [][] mat;
//		System.out.print("Enter number of rows: ");
//		r=sc.nextInt();
//		
//		System.out.print("Enter number of columns: ");
//		c=sc.nextInt();
//		sc.nextLine();
//		mat=new int[r][c];
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				mat[i][j]=sc.nextInt();
//			}
//		}
		
		//matPrint(mat);
		int[][] matrix= 
			{
				{1,0,0},
				{0,1,0},
				{0,0,1}
			};
		//matPrint(matrix);
		isIdentityMatrix(matrix);
		//matPrint(matrix);
		

	}
	static void matPrint(int[][] mat) {
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void isColumnMatrix(int[][] mat) {
		try {
		for(int i=0;i<mat.length;i++) {
			if(mat[i].length!=1) {
				System.out.println(" Non Column Matrix");
				return;
			}
			
		}
		System.out.println("Column Matrix");
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
	}
	static void isRowMatrix(int[][] mat) {
		try {
		
			if(mat.length==1) {
				System.out.println(" Row Matrix");
				return;
			}
			System.out.println("Not a Row Matrix");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static boolean isSquareMatrix(int[][] mat) {
		try {
			int r=mat.length;
			for(int i=0;i<r;i++) {
				if(mat[i].length!=r) {
					System.out.println("Not a Square matrix");
					return false;
				}
			}
			System.out.println("Square Matrix");
			return true;
			
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	static boolean isSingletonMatrix(int[][] mat) {
		try {
		
			if(isSquareMatrix(mat) && mat.length==1) {
				System.out.println(" Singleton Matrix");
				return true;
			}
			System.out.println("Not a Singleton Matrix");
			return false;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	static boolean isDiagonalMatrix(int[][] mat) {
		try {
			if(isSquareMatrix(mat)) {
				for(int i=0;i<mat.length;i++) {
					for(int j=0;j<mat[i].length;j++) {
						if(mat[i][j]!=0 && i!=j) {
							System.out.println(" Non Diagonal Matrix");
							return false;
						}
						else if(i==j && mat[i][j]!=0) {
							continue;
						}
					}
				}
			System.out.println(" Diagonal Matrix");
			return true;
			}
			return false;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}	
	}
	
	static boolean isIdentityMatrix(int[][] mat) {
		try {
			if(isSquareMatrix(mat)) {
				for(int i=0;i<mat.length;i++) {
					for(int j=0;j<mat[i].length;j++) {
						if(i==j && mat[i][j]==1 ) {
							continue;
						}
						else if(i!=j && mat[i][j]!=0) {
							System.out.println("Non Identity Matrix");
							return false;
						}
						else {
							System.out.println(" Non Identity Matrix");
							return false;
						}
					}
				}
			System.out.println(" Identity Matrix");
			return true;
			}
			System.out.println(" Non Identity Matrix");
			return false;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}	
	}

	static void func(int[][] mat) {
		int[] row=new int[mat.length];
		int[] column=new int[mat[0].length];
		for(int i=0;i<row.length;i++) {
			row[i]=0;
		}
		for(int i=0;i<column.length;i++) {
			column[i]=0;
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]==0) {
					row[i]=1;
					column[j]=1;
				}
			}
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(row[i]==1|| column[j]==1) {
					mat[i][j]=0;
				}
			}
		}
		
	}

}


class Pair{
	int r;
	int c;
	public Pair(int r,int c) {
		this.r=r;
		this.c=c;
	}
}

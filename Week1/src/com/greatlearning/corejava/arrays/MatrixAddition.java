package com.greatlearning.corejava.arrays;

public class MatrixAddition {
	
	public void addMatrices(int mat1[][], int mat2[][]) {
		int result[][] = new int[3][3];
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat2.length; j++) {
				result[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrx1[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int matrx2[][] = new int[][] {{10,20,30},{40,50,60},{70,80,90}};
		MatrixAddition max = new MatrixAddition();
		max.addMatrices(matrx1, matrx2);

	}

}

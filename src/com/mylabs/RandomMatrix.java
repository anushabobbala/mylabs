package com.mylabs;


	import java.util.Random;

	public class RandomMatrix {
		

		public static int[][] createMatrixWithRandomNumbers(int numRows, int numColumns){
			 	
			 	int[][] matrix = new int[numRows][numColumns];
			 		
			 	
			 	Random randomnumbergenerator=new Random();
			 		
			 	
			 		for(int i=0; i<numRows; i++){
			 			for(int j=0; j<numColumns; j++){
			 				matrix[i][j] = randomnumbergenerator.nextInt(100);
			 			}
			 		}
					return matrix;
		}
	public static void  print(int[][] matrix){
		
		int numRows=matrix.length;
		int numColumns=matrix[0].length;
		

		for(int i=0;i<numRows;i++){
			for(int j=0;j<numColumns;j++){
				
				System.out.println(matrix[i][j]);
				System.out.println(" ");
			}
		System.out.println("");	
		}
		
		
	}


		public static void main(String[] args) {
			int[][] matrix=createMatrixWithRandomNumbers(5,5);
			print(matrix);
			

			

		}
	}



package Today6Mar;
	public class Add3D {
		public static void main(String[] args) {
			int a[][]= {{1,2,4},{3,4,2},{1,2,4}}; // matrix 1
			int b[][]= {{1,5,2},{3,5,4},{5,6,7}}; // matrix 2
		// create new matrix for storing result(addition) 	
			int c[][]=new int [3][3];
		// logic for printing row and column	
				for (int i=0;i<3;i++) { // for printing row
				for (int j=0;j<3;j++) { // for printing column
		// logic for matrix sum			
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
		}}


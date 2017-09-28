package core.condition.hw;

public class TwoDimensionalMatrixAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//to print the matrix values
		//int a[][][] = {{{1,1,1},{ 1, 2, 3 } , { 4, 5, 6}}, {{1,1,1},{ 1, 2, 3 } , { 4, 5, 6}},{{1,1,1},{ 1, 2, 3 } , {4, 5, 6}}};
		//for(int i =0;i < a.length;i ++){
		//for(int j=0;j<a[i].length;j++){
			//for(int k =0; k<a[i][j].length;k++){
				//System.out.println("a["+i+"]["+j+"]["+k +"] = " + a[i][j][k]);		
				
		
		//2dimensional matrix addition
		int a [][]= {{1,2},{3,4}};
		int b [][] ={{5,2},{3,5}};
		int c[][] = new int [2][2];
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j=0;j < a.length; j++){
			c[i][j] = a[i][j] + b[i][j];
			}			
		}
		for (int i = 0; i < c.length; i++) {
			for (int j=0;j< c.length; j++)
			System.out.print(c[i][j] + " ");
		}
		 
	}

}

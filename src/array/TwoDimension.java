package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for (int i=0; i<arr.length; i++) { //arr.length는 행의 길이
			for (int j=0; j<arr[i].length; j++) { //arr[i].length는 열의 길이
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}

	}

}

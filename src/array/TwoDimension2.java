package array;

public class TwoDimension2 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3]; //이차원 배열 선언만 하고 초기화는 안함
		
		for (int i=0; i<arr.length;i++) {
			for (int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(arr.length);
		System.out.println(arr[0].length);

	}

}

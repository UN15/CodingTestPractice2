public class p1 {
// 1. 버블 정렬(Bubble Sort)
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 6, 7, 9, 1, 3, 5, 4, 8};
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1])
					swap(arr,j, j+1);
			}
		}
	}

}

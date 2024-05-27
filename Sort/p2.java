public class p2 {
// 2. 선택 정렬(Selection Sort)
//minIndex를 찾고 교환
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 6, 7, 9, 1, 3, 5, 4, 8};
		for(int i = 0; i<arr.length-1; i++) {
			int minIdx = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<arr[minIdx]) {
					minIdx = j;
				}
			}
			swap(arr, i, minIdx);
		}
	}
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}

}

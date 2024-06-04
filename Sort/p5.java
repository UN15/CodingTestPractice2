public class p5 {
	// 5. 병합 정렬(Merge Sort)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 6, 7, 9, 1, 3, 5, 4, 8, 10};
		int[] tmpArr = new int[arr.length];
		mergeSort(arr, tmpArr, 0, arr.length-1);
	}
	public static void mergeSort(int[] arr, int[] tmpArr, int left, int right){
		if(left<right) {
			int m = left+(right-left)/2;
			mergeSort(arr, tmpArr, left, m);
			mergeSort(arr, tmpArr, m+1, right);
			merge(arr, tmpArr, left, m, right);
		}
	}
	public static void merge(int[] arr, int[] tmpArr, int left, int mid, int right) {
		for(int i = left; i<=right; i++) {
			tmpArr[i] = arr[i];
		}
		int part1 = left;
	    int part2 = mid + 1;
	    int index = left;
	    while (part1 <= mid && part2 <= right) {
	        if (tmpArr[part1] <= tmpArr[part2]) {
	            arr[index] = tmpArr[part1];
	            part1++;
	        } else {
	            arr[index] = tmpArr[part2];
	            part2++;
	        }
	        index++;
	    }
	    for (int i = 0; i <= mid - part1; i++) {
	        arr[index + i] = tmpArr[part1 + i];
	    }
	}
}

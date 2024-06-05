public class p6 {
	// 6.힙 정렬(Heap Sort)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 6, 7, 9, 1, 3, 5, 4, 8, 10};
		sortByHeapSort(arr);
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	public static void sortByHeapSort(int[] arr) {
	    for (int i = arr.length / 2 - 1; i < arr.length; i++) {
	        heapify(arr, i, arr.length - 1);
	    }
	    for (int i = arr.length - 1; i >= 0; i--) {
	        swap(arr, 0, i);
	        heapify(arr, 0, i - 1);
	    }
	}
	public static void heapify(int[] arr, int parentIdx, int lastIdx) {
	    int leftChildIdx;
	    int rightChildIdx;
	    int largestIdx;
	    while (parentIdx * 2 + 1 <= lastIdx) {
	        leftChildIdx = (parentIdx * 2) + 1;
	        rightChildIdx = (parentIdx * 2) + 2;
	        largestIdx = parentIdx;
	        if (arr[leftChildIdx] > arr[largestIdx]) {
	            largestIdx = leftChildIdx;
	        }
	        if (rightChildIdx <= lastIdx && arr[rightChildIdx] > arr[largestIdx]) {
	            largestIdx = rightChildIdx;
	        }
	        if (largestIdx != parentIdx) {
	            swap(arr, parentIdx, largestIdx);
	            parentIdx = largestIdx;
	        } else {
	            break;
	        }
	    }
	}
}

public class p4 {
	// 4. 셸 정렬(Shell Sort)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 6, 7, 9, 1, 3, 5, 4, 8};
		for(int h = arr.length/2; h>0; h/=2) {
			for(int i = h; i<arr.length; i++) {
				int tmp = arr[i];
				int j = i-h;
				while(j>=0 && arr[j]>tmp) {
					arr[j+h] = arr[j];
					j-=h;
				}
				arr[j+h] = tmp;
			}
		}
			

	}

}

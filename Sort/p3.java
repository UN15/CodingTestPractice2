public class p3 {
 //3. 삽입 정렬(Insertion Sort)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 6, 7, 9, 1, 3, 5, 4, 8};
		for(int i = 1; i<arr.length; i++) {
			int tmp = arr[i];
			int j = i-1;
			while(j>=0 && tmp<arr[j]) {// 전 인덱스의 값이 현재 인덱스값보다 크면 
				arr[j+1] = arr[j]; // 현재 인덱스 값을 전 인덱스 값으로 변경
				j--;// j값을 줄여 총 비교 후
			}
			
			arr[j+1] = tmp;// 들어갈 위치 확인 후 한번에 tmp 값의 위치를 넣음
		}
	}
	

}

//ex)
//int i = 4;
//int tmp = arr[4] == 1
//int j= 3
//while(j>=0 && tmp <arr[j])
//arr[4]=arr[3]
//
//2 6 7 9 9 3 5 4 8
//
//j=2
//arr[3] = arr[2]
//
//2 6 7 7 9 3 5 4 8
//
//j = 1
//arr[2] = arr[1]
//2 6 6 7 9 3 5 4 8
//
//j = 0
//arr[1] = arr[0]
//2 2 6 7 9 3 5 4 8
//j--//-1
//
//arr[0] = 1

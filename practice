import java.util.*;

public class p3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {293,1000,395,678,94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		System.out.println(solution(arr, delete_list));
	}
//	public static ArrayList solution(int[] arr, int[] delete_list) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		for(int v: delete_list) {
//			for(int i = 0; i<arr.length; i++) {
//				if (v == arr[i])
//					arr[i] = 0;
//			}
//		}
//		for(int a = 0; a<arr.length; a++) {
//			if(arr[a] != 0) 
//				answer.add(arr[a]);
//		}
//		return answer;
//	}
	public static ArrayList solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i: arr) {
			answer.add(i);
		}
		for(int a: delete_list) {
			int index = answer.indexOf(a);
			if(index != -1)
				answer.remove(index);
		}
		return answer;
	}
}

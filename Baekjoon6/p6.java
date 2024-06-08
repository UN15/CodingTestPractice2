import java.io.*;
import java.util.Arrays;
public class p6 {
//1427
	public static void main(String[] args) throws IOException{
//		 TODO Auto-generated method stub
		//bufferedReader + stringBuilder+ count 정렬 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		int[] count = new int[10];
		for(int i = 0; i<str.length(); i++) {
			count[str.charAt(i)-'0']++;
		}
		for(int j = 9; j>=0; j--) {
			while(count[j]>0) {
				sb.append(j);
				count[j]--;
			}
		}
		System.out.println(sb);
		
	//bufferedReader+stringBuilder+arrays.sort	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		char[] arr = br.readLine().toCharArray();
//		Arrays.sort(arr);
//		for(int i = arr.length-1; i>=0; i--) {
//			sb.append(arr[i]);
//		}
//		System.out.println(sb);
	}

}

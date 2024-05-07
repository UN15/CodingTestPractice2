import java.util.*;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int[] result = new int[26];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>=97 && arr[i]<=122)
				arr[i]-=97;
			else if(arr[i]>=65 && arr[i]<=90)
				arr[i]-=65;
			result[arr[i]]++;
		}
		int max = -1;
		int max_num = -1;
		for(int i = 0; i<26; i++) {
			if(result[i]>max) {
				max = result[i];
				max_num = i;
			}
		}
		
		int count = 0;
		for(int e: result) {
			if(max == e)
				count++;
		}
		if(count == 1)
			System.out.println((char)(max_num+65));
		else
			System.out.println("?");
	}

}

import java.util.*;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		char[] result = new char[26];
		for(int i = 0; i<arr.length; i++) {
			if(Character.isUpperCase(arr[i])) 
				arr[i] = Character.toLowerCase(arr[i]);
			result[arr[i]]++;
		}
		int max = -1;
		for(int i = 0; i<26; i++)
			if(max<result[i])
				max = result[i];
	}

}

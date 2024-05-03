import java.util.*;
public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[26];
		for(int i = 0; i<26; i++)
			arr[i]= -1;
		for(int i = 0; i<s.length(); i++) {
			int index = s.charAt(i)-'a';
			if(arr[index] == -1)
				arr[index] = i;
		}
		for(int e: arr)
			System.out.print(e+" ");
	}

}

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public static class Member implements Comparable<Member> {
	int age;
	String name;
	
	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Member m) {
		return this.age - m.age;
	}
	
	
	
}
public class p10 {
//10814
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		StringTokenizer st;
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		
	} 

}


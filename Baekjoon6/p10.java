//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.StringTokenizer;
// 
//public class p10 {
//	public static void main(String[] args) throws IOException {		
// 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//        
//		Person[] p = new Person[N];
//		
// 
//		for(int i = 0; i < N; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			int age = Integer.parseInt(st.nextToken());
//			String name = st.nextToken();
//			p[i] = new Person(age, name);
//		}
// 
//		
//		// 타입을 Person 으로 둘 것.
//		Arrays.sort(p, new Comparator<Person>() {
//			// 나이순으로 정렬
//			@Override
//			public int compare(Person s1, Person s2) {
//				return s1.age - s2.age;
//			}
//			
//		});
// 
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = 0; i < N; i++) {
//			// 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
//			sb.append(p[i]);
//		}
//        
//		System.out.println(sb);
//		
//	}
//    
//	public static class Person {
//		int age;
//		String name;
//        
//		public Person(int age, String name) {
//			this.age = age;
//			this.name = name;
//		}
//        
//		@Override
//		public String toString() {
//			return age + " " + name + "\n";
//		}
//	}
// 
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
public class p10 {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
 
		
		Arrays.sort(arr, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
 
		
		for(int i = 0; i < n; i++) {
			sb.append(arr[i][0]+" "+ arr[i][1]+"\n");
		}
        
		System.out.println(sb);
		
	}
}

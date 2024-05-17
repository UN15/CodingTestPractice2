//import java.util.*;
//public class p3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		ArrayList<Integer> arr = new ArrayList<>();
//
//		while(n!=-1) {
//			int sum = 0;
//			for(int i = 1; i<n; i++) {
//				if(n%i == 0) {
//					sum+=i;
//					arr.add(i);
//				}
//			}
//			if(sum == n) {
//				System.out.print(n+" = ");
//				for(int j = 0; j<arr.size(); j++) {
//					if(j == arr.size()-1) {
//						System.out.println(arr.get(j));
//					}
//					else {
//						System.out.print(arr.get(j)+" + ");
//					}											
//				}
//			}
//			else {
//				System.out.println(n+" is NOT perfect.");
//			}
//					
//			
//			arr.clear();	
//			n = sc.nextInt();
//		}
//	}
//
//}
//import java.io.*;
//import java.util.ArrayList;
//public class p3 {
//
//	public static void main(String[] args) throws IOException{
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		ArrayList<Integer> arr = new ArrayList<>();
//
//		while(n!=-1) {
//			int sum = 0;
//			for(int i = 1; i<n; i++) {
//				if(n%i == 0) {
//					sum+=i;
//					arr.add(i);
//				}
//			}
//			if(sum == n) {
//				System.out.print(n+" = ");
//				for(int j = 0; j<arr.size(); j++) {
//					if(j == arr.size()-1) {
//						System.out.println(arr.get(j));
//					}
//					else {
//						System.out.print(arr.get(j)+" + ");
//					}											
//				}
//			}
//			else {
//				System.out.println(n+" is NOT perfect.");
//			}
//					
//			
//			arr.clear();	
//			n = Integer.parseInt(br.readLine());
//		}
//	}
//
//}
import java.io.*;
import java.util.ArrayList;
public class p3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> arr = new ArrayList<>();

		while(n!=-1) {
			int sum = 0;
			for(int i = 1; i<n; i++) {
				if(n%i == 0) {
					sum+=i;
					arr.add(i);
				}
			}
			if(sum == n) {
				sb.append(n+" = ");
				for(int j = 0; j<arr.size(); j++) {
					if(j == arr.size()-1) {
						sb.append(arr.get(j)+"\n");
					}
					else {
						sb.append(arr.get(j)+" + ");
					}											
				}
			}
			else {
				sb.append(n+" is NOT perfect.\n");
			}
			arr.clear();
			n = Integer.parseInt(br.readLine());
		}
		System.out.println(sb);
	}

}
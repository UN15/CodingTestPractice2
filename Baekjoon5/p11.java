//import java.io.*;
//public class p11 {
//
//	public static void main(String[] args) throws IOException{
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		int min_x = Integer.MAX_VALUE, max_x = Integer.MIN_VALUE;
//		int min_y = Integer.MAX_VALUE, max_y = Integer.MIN_VALUE;;
//		for(int i = 0; i<n; i++) {
//			String[] s = br.readLine().split(" ");
//			int x = Integer.parseInt(s[0]);
//			int y = Integer.parseInt(s[1]);
//			if(min_x>x)
//				min_x = x;
//			if(max_x < x)
//				max_x = x;
//			if(min_y > y)
//				min_y = y;
//			if(max_y < y)
//				max_y = y;
//		}
//		System.out.println((max_x - min_x)*(max_y - min_y));
//	}
//
//}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class p11 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a  = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
			}
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println((a[n-1] - a[0])*(b[n-1] - b[0]));
	}

}

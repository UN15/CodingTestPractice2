//import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
// EOF 
//Scanner는 hasNext 사용
//BufferedReader는 내장 함수 ㄴㄴ
public class p14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//      1. Scanner의 경우
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a+b);
//		}
//      2. BufferedReader의 경우 null이면 종료
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		StringTokenizer st;
		while((input = br.readLine())!=null) {
			st = new StringTokenizer(input);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a+b);
		}
	}

}

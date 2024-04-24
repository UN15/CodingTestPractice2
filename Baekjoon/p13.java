import java.io.*;
import java.util.StringTokenizer;
public class p13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;

		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			if(a == 0 && b==0)
				break;
			else
				System.out.println(a+b);
		}
			
	}

}
// bufferedWriter는 숫자 자료형 출력은 깨짐 String.valueOf(a+b)로 string형으로 변경해야 함
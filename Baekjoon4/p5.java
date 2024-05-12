import java.io.*;
public class p5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 1;
		int i = 1;
		int count = 1;
		while(a<n) {
			a = a+6*i;
			count++;
			i++;
		}
		System.out.println(count);
	}

}

// 벌집
//한 마름모 마지막 1=>7=>19=>37=>61 즉 6 12 18 24 간격 6의 배수로 진행
		

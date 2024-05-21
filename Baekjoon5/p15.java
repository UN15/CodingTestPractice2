import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class p15 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[3];
		a[0] = Integer.parseInt(st.nextToken());
		a[1] = Integer.parseInt(st.nextToken());
		a[2] = Integer.parseInt(st.nextToken());
		Arrays.sort(a);
		if(a[2]>=a[0]+a[1])
			System.out.println(2*(a[0]+a[1])-1);
		else
			System.out.println(a[0]+a[1]+a[2]);
	}

}

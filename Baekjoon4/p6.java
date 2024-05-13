import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int i = 0, n = 0;
		while(i<x) {
			n+=1;// 1, 2, 3, 4...
			i+=n;//1, 3, 6.... 
		}
		
		if(n%2 == 0) {
			for(int a = 0; a<n; a++) {
				if(i-a==x)
					System.out.print((n-a)+"/"+(a+1));
			}
			
		}
		else {
			for(int a = 0; a<n; a++) {
				if(i-a==x)
					System.out.print((a+1)+"/"+(n-a));
			}
		}
	}

}

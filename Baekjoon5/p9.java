import java.io.*;
public class p9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		String[] c = br.readLine().split(" ");
//		int a1 = Integer.parseInt(a[0]);
//		int a2 = Integer.parseInt(a[1]);
//	
//		int b1 = Integer.parseInt(b[0]);
//		int b2 = Integer.parseInt(b[1]);
//		
//		int c1 = Integer.parseInt(c[0]);
//		int c2 = Integer.parseInt(c[1]);

		String r1, r2;
		if(a[0].equals(b[0])) {
			r1 = c[0];
			if(c[1].equals(a[1])) {
				r2 = b[1];
			}
			else {
				r2 = a[1];
			}
		}
		else if (a[0].equals(c[0])) {
			r1 = b[0];
			if(b[1].equals(a[1])) {
				r2 = c[1];
			}
			else {
				r2 = a[1];
			}
		}
		else {
			r1 = a[0];
			if(a[1].equals(b[1])) {
				r2 = c[1];
			}
			else {
				r2 = b[1];
			}
		}
		System.out.println(r1+" "+r2);
			
	}

}

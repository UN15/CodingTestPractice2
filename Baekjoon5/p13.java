import java.io.*;
public class p13 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if(a+b+c != 180)
			System.out.println("Error");
		else {
			if(a == 60 && b == 60 && c == 60)
				System.out.println("Equilateral");
			else if(a!=b && b!=c && a!=c)
				System.out.println("Scalene");
			else
				System.out.println("Isosceles");
		}
	}

}

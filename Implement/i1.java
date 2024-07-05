import java.io.*;
public class i1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int x = 1; 
		int y = 1;
		for(int i = 0; i<str.length; i++) {
			if(str[i].equals("L")) {
				y-=1;
				if(y<1)
					y+=1;
			}
			else if(str[i].equals("R")) {
				y+=1;
				if(y>n)
					y-=1;
			}
			else if(str[i].equals("U")) {
				x-=1;
				if(x<1)
					x+=1;
			}
			else if(str[i].equals("D")) {
				x+=1;
				if(x>n)
					x-=1;
			}
			
		}
		
		System.out.println(x+" "+ y);
	}

}

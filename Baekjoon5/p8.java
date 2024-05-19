import java.io.*;
public class p8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sarr = br.readLine().split(" ");
		int x = Integer.parseInt(sarr[0]);
		int y = Integer.parseInt(sarr[1]);
		int w = Integer.parseInt(sarr[2]);
		int h = Integer.parseInt(sarr[3]);
		int[] carr = {x, y, w-x, h-y};
		int min = Integer.MAX_VALUE;
		
		for(int c: carr) {
			min = Math.min(min, c);
		}
		System.out.println(min);
	}

}

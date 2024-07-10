import java.io.*;
public class i3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		int x = arr[0]-'a';
		int y = arr[1]-'0'-1;
		System.out.println(x+" "+ y);
		int count = 0;
		//수평2 수직1
		if(x+2<8 && y+1<8) {
			count++;
		}
		if (x+2<8 && y-1>=0) {
			count++;
		}
		if (x-2>=0 && y+1<8) {
			count++;
		}
		if (x-2>=0 && y-1>=0) {
			count++;
		}
		//수직 2 수평 1
		if(x+1<8 && y+2<8) {
			count++;
		}
		if (x+1<8 && y-2>=0) {
			count++;
		}
		if (x-1>=0 && y+2<8) {
			count++;
		}
		if (x-1>=0 && y-2>=0) {
			count++;
		}
		System.out.println(count);
		
	}

}

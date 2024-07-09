import java.io.*;
public class i2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i<=n; i++){
			for(int j = 0; j<60; j++){
				for(int k = 0; k<60; k++){
			           if (String.valueOf(i).contains("3") || String.valueOf(j).contains("3") || String.valueOf(k).contains("3")){
			        	   count++;
				   }
		               }
			}
		}

		System.out.println(count);
		
	}

}

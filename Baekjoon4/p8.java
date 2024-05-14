import java.util.*;
public class p8 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		int n = Integer.valueOf(str[0]);
		int m = Integer.valueOf(str[1]);

		StringTokenizer st = new StringTokenizer(sc.nextLine());
		ArrayList<Integer> arr = new ArrayList<>();
		while(st.hasMoreTokens())
			arr.add(Integer.valueOf(st.nextToken()));
		
		int max = 0;
		for(int i = 0; i<n-2; i++) {
			for(int j = i+1; j<n-1; j++) {
				for(int k = j+1; k<n; k++) {
					int sum =arr.get(i)+arr.get(j)+arr.get(k);
					
					if(sum<=m) {
						max = Math.max(max, sum);					
					}					
				}	
			}
		}
		
		System.out.println(max);

	}
}

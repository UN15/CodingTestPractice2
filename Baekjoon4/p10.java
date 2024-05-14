import java.util.*;
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i<6; i++) {
			arr.add(Integer.parseInt(str[i]));
		}
			
		for(int x = -999; x<= 999; x++) {
			for(int y = -999; y<=999; y++) {
				if((arr.get(0)*x+arr.get(1)*y) == arr.get(2)){
					if((arr.get(3)*x+arr.get(4)*y) == arr.get(5))
						System.out.println(x+" "+y);
				}
			}
		}
				
	}

}

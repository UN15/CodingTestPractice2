import java.util.*;
public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i<10; i++) {
			int num = sc.nextInt();
			if(!(arr.contains(num%42)))
				arr.add(num%42);
		}
		System.out.println(arr.size());
	}

}

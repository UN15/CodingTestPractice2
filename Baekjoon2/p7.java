import java.util.*;
public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];
		for(int i = 0; i<30; i++)
			arr[i] = i+1;
		for(int i = 0; i<28; i++)
			arr[sc.nextInt()-1] = 0;
		
		for(int e: arr)
			if(e != 0)
				System.out.println(e);
	}

}

import java.util.*;
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		double max;
		double[] arr = new double[n];
		double average;
		for(int i = 0; i<n; i++)
			arr[i] = sc.nextDouble();
		max = arr[0];
		for(int i = 1; i<n; i++)
			if(max<arr[i])
				max = arr[i];
		for(int i = 0; i<n; i++) {
			arr[i] = arr[i]/max*100;
			sum+=arr[i];
		}
		
		average = sum/n;
		System.out.println(average);
	
	}

}

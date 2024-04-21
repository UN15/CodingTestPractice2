import java.util.*;
public class p1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
            	if(i != n/i) {
	                answer+=i;
	                answer+= n/i;
            	}
            	else
            		answer+=i;
            }
        }
		System.out.println(answer);
		
	}
	
}

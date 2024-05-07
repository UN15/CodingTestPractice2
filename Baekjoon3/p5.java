import java.util.*;
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int count = 0;
		int i = 0;
		while(i<c.length) {
			switch(c[i]) {
				case 'c':
					if(i+1 < c.length) {
						if(c[i+1] == '=')
							count++;
						else if(c[i+1] == '-')
							count++;
						i++;
					}
					else
						count++;
					break;
				case 'd':
					if(i+1 < c.length && c[i+1] == '-') {
						count++;
						i++;
					}
					else if(i+2<c.length && c[i+1] == 'z') {
						if(c[i+2] == '=') {
							count++;
						}
						else
							count+=3;
					}
			i++;
			}
		}
			
	}

}

import java.util.*;
public class p15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		System.out.println(solution(code));
	}
	public static String solution(String code) {
		String answer = "";
		String ret = "";
		char[] ch = code.toCharArray();
		int mode = 0;
		for(int i = 0; i<ch.length; i++) {
			if(mode == 0) {
				if(ch[i] != '1' && i%2 == 0) 
					ret+=ch[i];
				else if (ch[i] == '1')
					mode = 1;
			}
			else if (mode == 1) {
				if(ch[i] != '1' && i%2 != 0) 
					ret+=ch[i];
				else if (ch[i] == '1')
					mode = 0;
			}
		}
		
		if(ret.equals(""))
			answer = "EMPTY";
		else
			answer = ret;
		return answer;
	}

}

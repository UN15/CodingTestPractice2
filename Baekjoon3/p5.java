import java.util.*;
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int count = 0;
		int len = c.length;
		for(int i = 0; i<len; i++) {		
			if(c[i] == 'c' && i<len-1) {
				if(c[i+1] == '=' || c[i+1] == '-') 
					i++;
			}
			else if(c[i] == 'd' && i<len-1) {
				if(c[i+1] == '-') 
					i++;
				
				else if(c[i+1] == 'z' && i<len-2) {
					if(c[i+2] == '=') {
						i+=2;
					}
				}
			}
			
			else if(c[i] == 'l' && i<len-1) {
				if(c[i+1] == 'j')
					i++;
			}
			else if(c[i] == 'n' && i<len-1) {
				if(c[i+1] == 'j')
					i++;
			}
			else if(c[i] == 's' && i<len-1) {
				if(c[i+1] == '=')
					i++;
			}
			else if(c[i] == 'z' && i<len-1) {
				if(c[i+1] == '=')
					i++;
			}
			count++;
		}
			
		System.out.println(count);	
		
	}
}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
//        String str = sc.next();
//        
//        for (int i = 0; i < croatias.length; i++) {
//            if (str.contains(croatias[i]))
//                str = str.replace(croatias[i], "@");
//        }
//        System.out.println(str.length());
//        sc.close();
//    }
//}

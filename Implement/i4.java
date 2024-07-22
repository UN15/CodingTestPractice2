 import java.io.*;
 import java.util.StringTokenizer;
 public class i4 {
	 static int direction;
	 public static void turn_left() {
		direction-=1;
		if(direction == -1) {
			direction = 3;
		}
	 }
 	 public static void main(String[] args) throws IOException {
 		// TODO Auto-generated method stub
 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		 StringTokenizer st = new StringTokenizer(br.readLine());
 		 int n = Integer.parseInt(st.nextToken());
 		 int m = Integer.parseInt(st.nextToken());
 		
 		 st = new StringTokenizer(br.readLine());
 		 int a = Integer.parseInt(st.nextToken());
 		 int b = Integer.parseInt(st.nextToken());
 		 int d = Integer.parseInt(st.nextToken()); // 0 북쪽 1 동쪽 2 남쪽 3 서쪽
 		 direction = d;
 		 int[][] check = new int[n][m];//방문 여부 체크
		 int[][] arr = new int[n][m];
 		 for(int i = 0; i<n; i++) {
 			 st = new StringTokenizer(br.readLine());
 			 for(int j = 0; j<m; j++) {
 				 arr[i][j] = Integer.parseInt(st.nextToken()); //0 육지 1 바다
 			 }
 		 }
 		
 		 check[a][b] = 1;
 		 int count = 1;
 		 int turn_time = 0; //4방향 다 돌았는지 확인하기 위한 변수
 		 int[] dx = {-1, 0, 1, 0}; //북 동 남 서
 		 int[] dy = {0, 1, 0, -1};
 		 int nx, ny;
         while(true) {
        	 turn_left();
        	 nx = a+dx[direction];
        	 ny = b+dy[direction];
        	 if(arr[nx][ny] != 1 && check[nx][ny] == 0) {
        		 count+=1;
        		 check[nx][ny] = 1;
        		 a = nx;
        		 b = ny;
        		 turn_time = 0;
        		 continue;
        	 }
        	 else {
        		 turn_time+=1;
        		 if(turn_time == 4) {
        			 nx = a-dx[direction];
        			 ny = b-dx[direction];
        			 if(arr[nx][ny] == 0) {
        				 a = nx;
        				 b = ny;
        			 }
        			 else {
        				 break;
        			 }
        			 turn_time = 0;
        		 }
        	 }
         }
         System.out.println(count);
 		
 	}
 }


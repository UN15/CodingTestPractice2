class Solution {
    public int[] solution(int[] num_list, int n) {
        int l = 0;
        if(num_list.length%n != 0){
            l = num_list.length/n+1;
        }
        else{
            l = num_list.length/n;
        }
        int[] answer = new int[l];
        int i = 0;
        int a = 0;
        while(i < num_list.length){
            answer[a++] = num_list[i];
            i+=n;
        }
        return answer;
    }
}

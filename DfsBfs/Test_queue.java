import java.util.Queue;
import java.util.LinkedList;
public class Test_queue {
//FIFO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
	//	Queue q = new LinkedList<>();
		// 어떤 자료형이든 삽입 삭제 가능 전에 int형 넣어도 String 삽입 가능
		//add 삽입 성공시 true 실패는 Exception 발생 offer는 삽입 성공시 true 실패시 false
		System.out.println(q.add(1));
		q.add(2);
		System.out.println(q.offer(3));
		System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q.peek());
	}

}
//q.isEmpty() 공백이면 true 아니면 false
//q.contains(value) 해당값 존재하면 true 아니면 false
//q.size() 큐 사이즈
//q.clear()큐 초기화

//q.peek() 큐 헤드에 위치한 value 값 return 공백이면 null
//q.element() 큐 헤드에 위치한 value값 return 공백이면 exception 발생

//q.remove() 삭제된 값 return 공백이면 exception
//q.remove(value) 큐에 해당하는 value값 존재 시 삭제 후 true 존재하지 않으면 false
//q.poll() 삭제된 value값 return 공백이면 null 반환

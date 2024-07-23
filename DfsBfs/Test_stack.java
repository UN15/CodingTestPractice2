import java.util.Stack;
public class Test_stack {
//LIFO stack은 클래스 vector 클래스 상속
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		//add와 push 둘 다 데이터 삽입함 다만 add는 반환 값이 true/false지만 
		//push는 집어넣은 값이 return 함
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		System.out.println(s.search(3)); //3이 빠져나오는 순서
		System.out.println(s.search(1));
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		s.pop();
		s.pop();
		System.out.println(s.isEmpty());
		
		s.add(1);
		s.add(2);
		s.clear();
	}

}
//push 데이터 스택 추가
//peek 스택의 마지막 요소 반환 스택 비어있으면 예외 발생함
//isEmpty() 스택 비어있는지 여부 반환 비어있으면 true 아니면 false
//s.search(2) 해당 위치 반환 인자가 여러개인 경우 마지막 위치 반환 
//            위치는 인덱스가 아닌 빠져 나오는 순서를 말함 찾는 값이 없는 경우 -1 반환
//vector 클래스 상속했으며 List 인터페이스를 구현했으므로 size()로 크기를 알 수 있음

//
// LinkedList<E>클래스 Ex
// 저장된 인스턴스의 순차적 접근 방법 enhanced for문 사용
//

import java.util.LinkedList;
import java.util.List;

public class A3_EnhancedForCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();	// 컬렉션 인스턴스 생성
		
		// 컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// 저장된 문자열 인스턴스의 참조
		for(String s : list)
			System.out.print(s + '\t');
		System.out.println();
		
		list.remove(0); // 	첫 번째 인스턴스 삭제
		
		// 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for(String s : list)
			System.out.print(s + '\t');
		System.out.println();
	}
}

// 리스트 기반 자료구조는 열차 칸을 더하고 빼는 형태의 자료구조이다.
// 인스턴스 저장 ---> 열차 칸을 하나 더한다.
// 인스턴스 삭제 ---> 해당 열차 칸을 삭제한다.
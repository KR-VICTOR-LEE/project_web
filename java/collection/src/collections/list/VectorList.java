package collections.list;

import java.util.List;
import java.util.Vector;

public class VectorList {
	public static void main(String[] args) {
		
		// vector - 멀티 스레드 환경에서 사용함
		List<String> vegeList = new Vector<>();
		
		// 객체추가
		vegeList.add("양파"); // 0번 인덱스
		vegeList.add("마늘"); // 1
		vegeList.add("감자"); // 2
		
		// 특정 위치에 추가 - add
		vegeList.add(2, "고추");
		
		// "감자"를 상추로 변경 - set()
		vegeList.set(2, "상추");
		
		// "마늘" 삭제 - remove
		vegeList.remove(1);
		
		// 전체조회
		for (int i = 0; i < vegeList.size(); i++) {
			String vegetable = vegeList.get(i);
			System.out.println(vegetable);
		}
		
	}
}

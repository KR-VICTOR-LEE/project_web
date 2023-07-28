package arr_p;

import java.util.Arrays;

import org.apache.tomcat.util.collections.CaseInsensitiveKeyMap;

public class ArrayTest {

	public static void main(String[] args) {
		// 점수에 대응하는 수우미양가 등급 배열을 구현하세요

		int[] score = { 87, 65, 82, 46, 98, 65, 72, 34, 91, 79, 45, 67 };

		String[] result = new String[score.length];
		for (int i = 0; i < result.length; i++) {
			if (score[i] >= 90) {
				result[i] = "수";
			} else if (score[i] >= 80) {
				result[i] = "우";
			} else if (score[i] >= 70) {
				result[i] = "미";
			} else if (score[i] >= 60) {
				result[i] = "양";
			} else {
				result[i] = "가";
			}
		}
		System.out.println(Arrays.toString(result));
	}
}

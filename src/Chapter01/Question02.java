package Chapter01;

import java.util.Arrays;
import java.util.HashMap;

public class Question02 {

	/*
	 * 1-2. 순열 확인
	 * 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드를 작성하라.
	 */
	static boolean answer(String inputStr1, String inputStr2) {
		boolean isEqual = false;
		
		// 문자열 길이 비교
		if(inputStr1.length() != inputStr2.length()) {
			return false;
		}
		
		// 문자열 순열 비교
		if(sort(inputStr1).equals(sort(inputStr2))) {
			isEqual = true;
		}
		
		return isEqual;
	}
	
	static String sort(String inputStr) {
		char[] charArr = inputStr.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);
	}
	
	public static void main(String[] args) {
		boolean answer = answer("ba c ", "b ca");
		System.out.println(answer);
	}

}

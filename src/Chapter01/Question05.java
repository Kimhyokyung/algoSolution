package Chapter01;

import java.util.Arrays;

public class Question05 {
	
	/*
	 * 1-5. 하나 빼기
	 * 문자열을 편집하는 방법에는 세 가지 종류가 있다. 문자 삽입, 문자 삭제, 문자 교체.
	 * 문자열 두 개가 주어졌을 때, 문자열을 같게 만들기 위한 편집 횟수가 1회 이내인지 확인하는 함수를 작성하라.
	 */
	static int answer(String inputStr1, String inputStr2) {
		
		// 문자열의 길이가 같을 경우 (문자 교체 편집 횟수 체크)
		if(inputStr1.length() == inputStr2.length()) {
			int diffCnt = 0;
			char[] inputStr1Arr = inputStr1.toCharArray();
			Arrays.sort(inputStr1Arr);
		}
		
		// 문자열의 길이가 다를 경우 (다른 문자열 갯수 체크)
		
		return 1;
	}
	
	public static void main(String[] args) {
		int answer = answer("pale", "ple");
		System.out.println(answer);
	}
	
}

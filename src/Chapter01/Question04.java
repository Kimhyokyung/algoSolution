package Chapter01;

import java.util.HashMap;

public class Question04 {
	
	/*
	 * 1-4. 회문순열
	 * 주어진 문자열이 회문의 순열인지 아닌지 확인하는 함수를 작성하라.
	 * 회문이란 앞으로 읽으나 뒤로 읽으나 같은 단어 혹은 구절을 의미하며, 순열이란 문자열을 재배치하는 것을 뜻한다.
	 * 회문이 꼭 사전에 등장하는 단어로 제한될 필요는 없다.
	 */
	static boolean answer(String inputStr) {
		boolean isPalindrome = false;
		
		inputStr = inputStr.replaceAll(" ", ""); // 공백 제거
		inputStr = inputStr.toLowerCase(); // 대소문자 구분 제거
		
		// 문자 수 세기
		HashMap<Character, Integer> charHash = new HashMap<>();
		for(int i=0; i<inputStr.length(); i++) {
			if(inputStr.charAt(i) == ' ') continue;
			charHash.put(inputStr.charAt(i), charHash.getOrDefault(inputStr.charAt(i), 0)+1);
		}
		
		if(inputStr.length()%2 == 0) {
			// 문자열의 길이가 짝수일 경우 모든 문자가 짝수
			for(Character key : charHash.keySet()) {
				if(charHash.get(key)%2 != 0) {
					isPalindrome = false;
					return isPalindrome;
				}
			}
			isPalindrome = true;
		} else {
			// 문자열의 길이가 홀수일 경우 단 하나의 문자가 홀수
			int evenCnt = 0, oddCnt=0;
			for(Character key : charHash.keySet()) {
				if(charHash.get(key)%2 == 0) {
					evenCnt++;
				} else {
					oddCnt++;
				}
			}
			
			if(oddCnt == 1) {
				isPalindrome = true;
			}
		}
		
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		boolean answer1 = answer("Tact Coa");
		System.out.println(answer1);
		boolean answer2 = answer("abc abc");
		System.out.println(answer2);
	}

}

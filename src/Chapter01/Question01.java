package Chapter01;

import java.util.HashMap;

public class Question01 {
	
	/*
	 * 1-1. 중복이 없는가
	 * 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
	 * 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
	 */
	static boolean answer(String inputStr) {
		boolean isDupl = false;
		HashMap<Character, Integer> keyHash = new HashMap<Character, Integer>();
		
		for(int i=0; i<inputStr.length(); i++) {
			if(keyHash.containsKey(inputStr.charAt(i))) {
				isDupl = true;
			} else {
				keyHash.put(inputStr.charAt(i), 1);
			}
		}
		
		return isDupl;
	}
	
	public static void main(String[] args) {
		boolean answer = Question01.answer("test");
		System.out.println(answer);
	}
	
}

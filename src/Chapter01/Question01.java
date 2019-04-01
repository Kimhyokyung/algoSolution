package Chapter01;

import java.util.HashMap;

public class Question01 {
	
	/*
	 * 1-1. �ߺ��� ���°�
	 * ���ڿ��� �־����� ��, �� ���ڿ��� ���� ���ڰ� �ߺ��Ǿ� �����ϴ��� Ȯ���ϴ� �˰����� �ۼ��϶�.
	 * �ڷᱸ���� �߰��� ������� �ʰ� Ǯ �� �ִ� �˰��� ���� ����϶�.
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

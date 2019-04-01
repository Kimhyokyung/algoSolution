package Chapter01;

import java.util.HashMap;

public class Question04 {
	
	/*
	 * 1-4. ȸ������
	 * �־��� ���ڿ��� ȸ���� �������� �ƴ��� Ȯ���ϴ� �Լ��� �ۼ��϶�.
	 * ȸ���̶� ������ ������ �ڷ� ������ ���� �ܾ� Ȥ�� ������ �ǹ��ϸ�, �����̶� ���ڿ��� ���ġ�ϴ� ���� ���Ѵ�.
	 * ȸ���� �� ������ �����ϴ� �ܾ�� ���ѵ� �ʿ�� ����.
	 */
	static boolean answer(String inputStr) {
		boolean isPalindrome = false;
		
		inputStr = inputStr.replaceAll(" ", ""); // ���� ����
		inputStr = inputStr.toLowerCase(); // ��ҹ��� ���� ����
		
		// ���� �� ����
		HashMap<Character, Integer> charHash = new HashMap<>();
		for(int i=0; i<inputStr.length(); i++) {
			if(inputStr.charAt(i) == ' ') continue;
			charHash.put(inputStr.charAt(i), charHash.getOrDefault(inputStr.charAt(i), 0)+1);
		}
		
		if(inputStr.length()%2 == 0) {
			// ���ڿ��� ���̰� ¦���� ��� ��� ���ڰ� ¦��
			for(Character key : charHash.keySet()) {
				if(charHash.get(key)%2 != 0) {
					isPalindrome = false;
					return isPalindrome;
				}
			}
			isPalindrome = true;
		} else {
			// ���ڿ��� ���̰� Ȧ���� ��� �� �ϳ��� ���ڰ� Ȧ��
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

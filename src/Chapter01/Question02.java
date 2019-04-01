package Chapter01;

import java.util.Arrays;
import java.util.HashMap;

public class Question02 {

	/*
	 * 1-2. ���� Ȯ��
	 * ���ڿ� �� ���� �־����� �� �� ���� ���� ���� ���迡 �ִ��� Ȯ���ϴ� �޼��带 �ۼ��϶�.
	 */
	static boolean answer(String inputStr1, String inputStr2) {
		boolean isEqual = false;
		
		// ���ڿ� ���� ��
		if(inputStr1.length() != inputStr2.length()) {
			return false;
		}
		
		// ���ڿ� ���� ��
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

package Chapter01;

import java.util.Arrays;

public class Question05 {
	
	/*
	 * 1-5. �ϳ� ����
	 * ���ڿ��� �����ϴ� ������� �� ���� ������ �ִ�. ���� ����, ���� ����, ���� ��ü.
	 * ���ڿ� �� ���� �־����� ��, ���ڿ��� ���� ����� ���� ���� Ƚ���� 1ȸ �̳����� Ȯ���ϴ� �Լ��� �ۼ��϶�.
	 */
	static int answer(String inputStr1, String inputStr2) {
		
		// ���ڿ��� ���̰� ���� ��� (���� ��ü ���� Ƚ�� üũ)
		if(inputStr1.length() == inputStr2.length()) {
			int diffCnt = 0;
			char[] inputStr1Arr = inputStr1.toCharArray();
			Arrays.sort(inputStr1Arr);
		}
		
		// ���ڿ��� ���̰� �ٸ� ��� (�ٸ� ���ڿ� ���� üũ)
		
		return 1;
	}
	
	public static void main(String[] args) {
		int answer = answer("pale", "ple");
		System.out.println(answer);
	}
	
}

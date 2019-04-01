package Chapter01;

public class Question03 {
	
	/*
	 * 1-3. URLȭ
	 * ���ڿ��� ��� �ִ� ��� ������ '%20'���� �ٲ� �ִ� �޼��带 �ۼ��϶�.
	 * ���������� ��� ���ڸ� �� ���� �� ���� ��ŭ ����� ������ �̹� Ȯ���Ǿ� ������ ���ڿ��� ���� ���̰� �Բ� �־����ٰ� �����ص� �ȴ�.
	 * (�ڹٷ� �����Ѵٸ� �迭 �ȿ��� �۾��� �� �ֵ��� ���� �迭�� �̿��ϱ� �ٶ���)
	 */
	
	// ��1: �迭�� ���ۺ��� ���������� ġȯ
	static String answer1(String inputStr, int inputLength) {
		
		// ���� ���� ���
		int spaceCnt = 0;
		for(int i=0; i<inputLength; i++) {
			if(inputStr.charAt(i) == ' ') {
				spaceCnt++;
			}
		}
		
		// ���ڿ� �迭 ���� ó��
		int strLength = inputLength + spaceCnt*2;
		char[] answerArr = new char[strLength];
		int j = 0;
		for(int i=0; i<inputLength; i++) {
			if(inputStr.charAt(i) == ' ') {
				answerArr[j] = '%';
				answerArr[j+1] = '2';
				answerArr[j+2] = '0';
				j += 3;
			} else {
				answerArr[j] = inputStr.charAt(i);
				j++;
			}
		}
		
		return new String(answerArr);
	}
	
	// ��2: �迭�� ������ �������� ġȯ
	static String answer2(String inputStr, int inputLength) {
		
		// ���� ���� ���
		int spaceCnt = 0;
		for(int i=0; i<inputLength; i++) {
			if(inputStr.charAt(i) == ' ') {
				spaceCnt++;
			}
		}
		
		// ���ڿ� �迭 ���� ó��
		int strLength = inputLength + spaceCnt*2;
		char[] answerArr = new char[strLength];
		int idx = strLength-1;
		for(int i=inputLength-1; i>=0; i--) {
			if(inputStr.charAt(i) == ' ') {
				answerArr[idx] = '0';
				answerArr[idx-1] = '2';
				answerArr[idx-2] = '%';
				idx -= 3;
			} else {
				answerArr[idx] = inputStr.charAt(i);
				idx--;
			}
		}
		
		return new String(answerArr);
	}

	public static void main(String[] args) {
		String answer1 = answer1("Mr John Smith", 13);
		String answer2 = answer2("Mr John Smith", 13);
		System.out.println(answer1);
		System.out.println(answer2);
	}

}

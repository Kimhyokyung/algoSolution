package Chapter01;

public class Question03 {
	
	/*
	 * 1-3. URL화
	 * 문자열에 들어 있는 모든 공백을 '%20'으로 바꿔 주는 메서드를 작성하라.
	 * 최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한 공간이 이미 확보되어 있으며 문자열의 최종 길이가 함께 주어진다고 가정해도 된다.
	 * (자바로 구현한다면 배열 안에서 작업할 수 있도록 문자 배열을 이용하길 바란다)
	 */
	
	// 답1: 배열의 시작부터 순차적으로 치환
	static String answer1(String inputStr, int inputLength) {
		
		// 공백 갯수 계산
		int spaceCnt = 0;
		for(int i=0; i<inputLength; i++) {
			if(inputStr.charAt(i) == ' ') {
				spaceCnt++;
			}
		}
		
		// 문자열 배열 공백 처리
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
	
	// 답2: 배열의 끝부터 역순으로 치환
	static String answer2(String inputStr, int inputLength) {
		
		// 공백 갯수 계산
		int spaceCnt = 0;
		for(int i=0; i<inputLength; i++) {
			if(inputStr.charAt(i) == ' ') {
				spaceCnt++;
			}
		}
		
		// 문자열 배열 공백 처리
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

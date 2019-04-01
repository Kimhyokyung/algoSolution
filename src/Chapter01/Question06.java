package Chapter01;

public class Question06 {

	/*
	 * 1-6. 문자열 압축
	 * 반복되는 문자의 개수를 세는 방식의 기본적인 문자열 압축 메서드를 작성하라.
	 * 예를 들어 문자열 aabcccccaaa를 압축하면 a2b1c5a3이 된다.
	 * 만약 압축된 문자열의 길이가 기존의 문자열의 길이보다 길다면 기존 문자열을 반환해야 한다.
	 * 문자열은 대소문자 알파벳(a~z)로만 이루어져있다.
	 */
	static String answer(String inputStr) {
		
		int charCnt = 1;
		char prevChar = inputStr.charAt(0);
		for(int i=0; i<inputStr.length(); i++) {
			if(i == 0) continue;
			if(inputStr.charAt(i) != prevChar) {
				prevChar = inputStr.charAt(i);
				charCnt++;
			}
		}
		
		if(charCnt*2 > inputStr.length()) {
			return inputStr;
		} else {
			StringBuilder sb = new StringBuilder();
			String newStr = "";
			int newCharCnt = 1;
			prevChar = inputStr.charAt(0);
			for(int i=0; i<inputStr.length(); i++) {
				if(i == 0) continue;
				if(inputStr.charAt(i) == prevChar) {
					newCharCnt++;
				} else {
					sb.append(prevChar);
					sb.append(newCharCnt);
					prevChar = inputStr.charAt(i);
					newCharCnt = 1;
				}
				
				if(i == inputStr.length()-1) {
					sb.append(prevChar);
					sb.append(newCharCnt);
				}
			}
			
			
			
			return sb.toString();
		}
	}
	
	public static void main(String[] args) {
		//String answer = answer("aabccaaabcde");
		String answer = answer("aabcccccaaa");
		System.out.println(answer);
	}

}

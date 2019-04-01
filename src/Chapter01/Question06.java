package Chapter01;

public class Question06 {

	/*
	 * 1-6. ���ڿ� ����
	 * �ݺ��Ǵ� ������ ������ ���� ����� �⺻���� ���ڿ� ���� �޼��带 �ۼ��϶�.
	 * ���� ��� ���ڿ� aabcccccaaa�� �����ϸ� a2b1c5a3�� �ȴ�.
	 * ���� ����� ���ڿ��� ���̰� ������ ���ڿ��� ���̺��� ��ٸ� ���� ���ڿ��� ��ȯ�ؾ� �Ѵ�.
	 * ���ڿ��� ��ҹ��� ���ĺ�(a~z)�θ� �̷�����ִ�.
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

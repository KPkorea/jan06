package coll;

public class KeyMaker {
	private final static String PATTERN = "annna-aaaaa-aaana-nanan-annaa";
	private final static int[] NUMBER = {1,2,3,4,5,6,7,8,9,0}; 
	private final static char[] ALPA = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	
	public String makeKey() {
		//String key = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < PATTERN.length(); i++) {
			if(PATTERN.charAt(i) == 'a') {
				sb.append(alpabet());
			}else if(PATTERN.charAt(i)=='n') {
				sb.append(number());
			}else{
				sb.append("-");
			}
		}
		return sb.toString();
	}
	
	private int number() {
		return (int)(Math.random() * NUMBER.length); //0~9
	}
	
	private int alpabet() {	
		//각 배열의 길이만큼 돌게 변경
		return ALPA [(char)(Math.random() * ALPA.length)];	//A~Z	
	}
	
	
	public static void main(String[] args) {
		
		KeyMaker key = new KeyMaker();
		String result = key.makeKey();
		System.out.println(result);
		
		
		
		
		
		
		
		
	}
}

package what;

public class What {
	public static void main(String[] args) {
		String str = "aaabbcccccca";
		String save = "";
		char ch = str.charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); ++i) {
			if (ch == str.charAt(i)) {
				count++;

			} else {

				save += ch;
				save += count;

				if (i + 1 >= str.length()) {
					ch = str.charAt(i);
				} else {
					ch = str.charAt(i + 1);
				}
				count = 1;
			}
		}

		save += ch;
		save += count;

		System.out.println(save);

	}
}

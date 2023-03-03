
public class Btvn_3 {

	public static void main(String[] args) {
		int count = 0;
		String substring = "ab";
		String s = "This is string ab and ab ab and ab";
		
		for(int i = 0; i <= s.length() - substring.length(); i++) {
			if(s.substring(i, i + substring.length()).equals(substring)) {
				count++;
			}
		}
		System.out.println("So lan xuat hien cua " + substring + " la: "+ count);
	}

}

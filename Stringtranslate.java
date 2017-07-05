import java.util.Scanner;

public class Stringtranslate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nu = s.next();
		String str = "abcdefghijklmnopqrstuvwxyz";
		int a = 0;
		int b = 0;
		String snum = "";
		for (int i = 0; i < nu.length(); i++) {
			a = Character.getNumericValue(nu.charAt(i));
			System.out.print(str.charAt(a - 1));
		}
		System.out.println();
		for (int i = 0; i < nu.length() - 1; i++) {
			snum = Character.toString(nu.charAt(i)) + Character.toString(nu.charAt(i + 1));
			b = Integer.parseInt(snum);
			if (b < 26) {
				System.out.print(str.charAt(b));
			}
		}
		snum = Character.toString(nu.charAt(nu.length() - 2)) + Character.toString(nu.charAt(nu.length() - 1));
		b = Integer.parseInt(snum);
		if (b < 26) {
			System.out.print(str.charAt(b));
		}
		s.close();
	}

}

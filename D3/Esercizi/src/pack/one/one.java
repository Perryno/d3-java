package pack.one;

public class one {
	
	
	public static boolean pariOdispari(String str) {
		int lenght = str.length();
		return lenght % 2 == 0;
	}
	
	public static boolean  annoBisestile(int anno) {
		if( anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0) {
		return true	;}
		else {
			return false;
		}
	}
}

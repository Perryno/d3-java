package pack.three;

public class While {
	
	
	static String separaStringa(String stringa) {
		
	int i = 0;
	String output = "";
	while (i < stringa.length()) {
		output += stringa.charAt(i) + ",";
		i++;
	
	}
	return output.substring(0,output.length()-1);
}
}
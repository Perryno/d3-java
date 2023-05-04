package primoPackage.students;

public class Student {
	char gender;
	String firstName;
	String lastName;
	double[] arrayVoti;
	
	public Student(char gender,String firstName, String lastName, double[] arrayVoti) {
		this.gender=gender;
		this.firstName=firstName;
		this.lastName=lastName;
		this.arrayVoti=arrayVoti;
	}
	
	public double mediaVoti() {
		double sum = 0;
		for (int i = 0; i<arrayVoti.length;i++) {
			sum +=arrayVoti[i];
		}
		return sum/arrayVoti.length;
	}
	
	
	
	public static Student bestMaleStudent (Student[] studenti) {
		double maxAverageRate;
		for(int i=0;i<studenti.length;i++) {
			if(studenti[i].gender =='M') {
				return 
			}
		}
	}
}

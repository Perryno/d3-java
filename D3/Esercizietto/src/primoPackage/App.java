package primoPackage;

import primoPackage.students.Student;

public class App {

	public static void main(String[] args) {
		int grandezza = 10;
		for(int i = 1;i <= grandezza; i++) {
			for(int j =1; j<= grandezza; j++) {
				int risultato = i * j; 
				System.out.print(risultato + "\t");
			}
			System.out.println();
		}
		Student student1 = new Student('M',"Mario", "Rossi", new double[]  {2,5,1});
		Student student2 = new Student('F',"Mario", "Rossi", new double[] {1,9,8});
		Student student3 = new Student('M',"Mario", "Rossi", new double[]  {1,4,8});
		Student student4 = new Student('F',"Mario", "Rossi", new double[]  {5,4,8});
		Student student5 = new Student('M',"Mario", "Rossi", new double[]  {3,5,9});
		
		System.out.println(student1.mediaVoti());
	}

}



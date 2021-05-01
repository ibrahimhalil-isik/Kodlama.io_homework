package gün3_ödev2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "Ýbrahim";
		student1.lastName = "IÞIK";
		student1.email = "ibrahim@isik.com";
		student1.Password = "12345";
		student1.registeredCourse = " Yazýlým Geliþtirici Yetiþtirme Kampý ( C# + ANGULAR ) ";
		
		Student student2 = new Student();
		student2.id = 1;
		student2.firstName = "Tunahan";
		student2.lastName = "ARIÇ";
		student2.email = "tunahan@arýç.com";
		student2.Password = "12345";
		student2.registeredCourse = " Yazýlým Geliþtirici Yetiþtirme Kampý ( JAVA + REACT ) ";
		
		Student[] students = {
				student1,student2 	
			};
			 
			for ( Student student : students ) {
				System.out.print(student.firstName +" "+ student.lastName );
				System.out.println( " > Aldýðý Ders : "+student.registeredCourse);
				System.err.println();
			}
		
		Instructor instructor1 = new Instructor();
		
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiroð";
		instructor1.email = "engin@demirog.com";
		instructor1.Password = "12345";
		instructor1.course = " C# + ANGULAR <=> JAVA + REACT "; 
		
		Instructor[] instructors = {
				instructor1	
			};
			 
			for ( Instructor instructor : instructors ) {
				System.out.print(instructor.firstName);
				System.out.println( " > Verdiði Ders : " + instructor.course);
			}
	}
}

package g�n3_�dev2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "�brahim";
		student1.lastName = "I�IK";
		student1.email = "ibrahim@isik.com";
		student1.Password = "12345";
		student1.registeredCourse = " Yaz�l�m Geli�tirici Yeti�tirme Kamp� ( C# + ANGULAR ) ";
		
		Student student2 = new Student();
		student2.id = 1;
		student2.firstName = "Tunahan";
		student2.lastName = "ARI�";
		student2.email = "tunahan@ar��.com";
		student2.Password = "12345";
		student2.registeredCourse = " Yaz�l�m Geli�tirici Yeti�tirme Kamp� ( JAVA + REACT ) ";
		
		Student[] students = {
				student1,student2 	
			};
			 
			for ( Student student : students ) {
				System.out.print(student.firstName +" "+ student.lastName );
				System.out.println( " > Ald��� Ders : "+student.registeredCourse);
				System.err.println();
			}
		
		Instructor instructor1 = new Instructor();
		
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiro�";
		instructor1.email = "engin@demirog.com";
		instructor1.Password = "12345";
		instructor1.course = " C# + ANGULAR <=> JAVA + REACT "; 
		
		Instructor[] instructors = {
				instructor1	
			};
			 
			for ( Instructor instructor : instructors ) {
				System.out.print(instructor.firstName);
				System.out.println( " > Verdi�i Ders : " + instructor.course);
			}
	}
}

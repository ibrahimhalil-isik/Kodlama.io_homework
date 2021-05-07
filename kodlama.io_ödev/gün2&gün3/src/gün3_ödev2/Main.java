package gün3_ödev2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "İbrahim";
		student1.lastName = "IŞIK";
		student1.email = "ibrahim@isik.com";
		student1.Password = "12345";
		student1.registeredCourse = " Yazılım Geliştirici Yetiştirme Kampı ( C# + ANGULAR ) ";
		
		Student student2 = new Student();
		student2.id = 1;
		student2.firstName = "Tunahan";
		student2.lastName = "ARIÇ";
		student2.email = "tunahan@arıç.com";
		student2.Password = "12345";
		student2.registeredCourse = " Yazılım Geliştirici Yetiştirme Kampı ( JAVA + REACT ) ";
		
		Student[] students = {
				student1,student2 	
			};
			 
			for ( Student student : students ) {
				System.out.print(student.firstName +" "+ student.lastName );
				System.out.println( " > Aldığı Ders : "+student.registeredCourse);
				System.out.println();
			}
		
		Instructor instructor1 = new Instructor();
		
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiroğ";
		instructor1.email = "engin@demirog.com";
		instructor1.Password = "12345";
		instructor1.course = " C# + ANGULAR <=> JAVA + REACT "; 
		
		Instructor[] instructors = {
				instructor1	
			};
			 
			for ( Instructor instructor : instructors ) {
				System.out.print(instructor.firstName);
				System.out.println( " > Verdiği Ders : " + instructor.course);
				System.out.println();
			}
			
			StudentManager studentManager = new StudentManager();
			studentManager.add();
			studentManager.register();
			System.out.println();
			
			InstructorManager instructorManager = new InstructorManager();
			instructorManager.add();
			instructorManager.uploaded();
			System.out.println();
	}
}

package gün2_ödev1;

public class _Main {

	public static void _main(String[] args) {
		
		_Instructor instructor1 = new _Instructor(1, "Engin", "Demiroð");
		
		_Instructor[] instructors = {
			instructor1	
		};
		 
		for (_Instructor instructor :instructors) {
			System.out.println(instructor.firstName);
		}
		 
		_Category category1 = new _Category();
		category1.id = 1;
		category1.categoryName = "Programlama";
		
		_Category[] categories = {category1};
		
		for (_Category category : categories) {
			System.out.println(category.categoryName);
		}
		
	}

}

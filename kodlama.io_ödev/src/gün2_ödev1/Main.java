package gün2_ödev1;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð");
		
		Instructor[] instructors = {
			instructor1	
		};
		
		for (Instructor instructor :instructors) {
			System.out.println(instructor.firstName);
		}
		 
		Category category1 = new Category();
		category1.id = 1;
		category1.categoryName = "Programlama";
		
		Category[] categories = {category1};
		
		for (Category category : categories) {
			System.out.println(category.categoryName);
		}
		
	}

}

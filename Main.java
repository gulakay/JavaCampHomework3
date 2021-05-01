package day3;

public class Main {

	public static void main(String[] args) {

		StudentManager studentManager = new StudentManager();

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Gül");
		student.setLastName("AKAY\n"); 
		student.setEmail("*****@mail.com");

		studentManager.add(student);

		InstructorManager instructorManager = new InstructorManager();

		Instructor instructor = new Instructor();

		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroð\n";
		instructor.email = "*****@mail.com";
		instructor.setCoursesOfTheInstructor("Yazýlým Geliþtirici Yetiþtirme Kampý : Java & React");
		
		 System.out.print("Eðitmen: ");
			instructorManager.add(instructor);


		System.out.print("Kurs: ");
		System.out.println(instructor.getCoursesOfTheInstructor());

	   
	}

}

package day3;

public class Main {

	public static void main(String[] args) {

		StudentManager studentManager = new StudentManager();

		Student student = new Student();
		student.setId(1);
		student.setFirstName("G�l");
		student.setLastName("AKAY\n"); 
		student.setEmail("*****@mail.com");

		studentManager.add(student);

		InstructorManager instructorManager = new InstructorManager();

		Instructor instructor = new Instructor();

		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiro�\n";
		instructor.email = "*****@mail.com";
		instructor.setCoursesOfTheInstructor("Yaz�l�m Geli�tirici Yeti�tirme Kamp� : Java & React");
		
		 System.out.print("E�itmen: ");
			instructorManager.add(instructor);


		System.out.print("Kurs: ");
		System.out.println(instructor.getCoursesOfTheInstructor());

	   
	}

}

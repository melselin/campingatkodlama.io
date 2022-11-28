package kodlamaioIndex.dataAccess;

import kodlamaioIndex.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.get_instructorName()+ " with the id:"+ instructor.get_instructorId() + " has been successfully added via Hibernate.");
		
	} 

}

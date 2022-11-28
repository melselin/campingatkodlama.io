package kodlamaioIndex.dataAccess;

import kodlamaioIndex.entities.Course;

public class HibernateCourseDao implements CourseDao {


	@Override
	public void add(Course course) {
		System.out.println(course.get_courseName()+" has been successfully added via hibernate.");
		
	}

}

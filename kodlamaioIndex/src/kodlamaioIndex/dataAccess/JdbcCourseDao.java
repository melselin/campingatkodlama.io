package kodlamaioIndex.dataAccess;

import kodlamaioIndex.entities.Course;

public class JdbcCourseDao implements CourseDao{
	@Override
	public void add(Course course) {
		System.out.println("Added via jdbc");
	}

}

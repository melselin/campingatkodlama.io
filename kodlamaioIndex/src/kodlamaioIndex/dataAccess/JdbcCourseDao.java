package kodlamaioIndex.dataAccess;

import kodlamaioIndex.entities.Course;

public class JdbcCourseDao implements CourseDao{
	@Override
	public void add(Course course) {
		System.out.println(course.get_courseName()+  " with the id:"+ course.get_courseId() +" has been successfully added via jdbc");
	}

}

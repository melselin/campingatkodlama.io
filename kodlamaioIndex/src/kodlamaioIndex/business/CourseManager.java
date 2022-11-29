package kodlamaioIndex.business;

import kodlamaioIndex.core.logging.Logger;
import kodlamaioIndex.dataAccess.CourseDao;
import kodlamaioIndex.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		for (Course newCourse : courses) {
			if (course.get_courseName() == newCourse.get_courseName())
				throw new Exception("This course name has been already taken. Please try again.");
			if (course.get_coursePrice() < 0) {

				throw new Exception("The course price can not be lesser than 0 TRY!");
			}
		}

		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.get_courseName());

		}

	}

}

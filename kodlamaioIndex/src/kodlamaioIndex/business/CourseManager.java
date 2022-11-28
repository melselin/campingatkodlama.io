package kodlamaioIndex.business;

import kodlamaioIndex.core.logging.Logger;
import kodlamaioIndex.dataAccess.CourseDao;
import kodlamaioIndex.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.get_coursePrice()<0) {
			throw new Exception("The course price can not be lesser than 0 TRY!");
		}
		
		
		courseDao.add(course);
		for(Logger logger:loggers) {
			logger.log(course.get_courseName());
			
		}
		
		
	}
	

}

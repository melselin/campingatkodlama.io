package kodlamaioIndex;

import kodlamaioIndex.business.CourseManager;
import kodlamaioIndex.core.logging.DataBaseLogger;
import kodlamaioIndex.core.logging.FileLogger;
import kodlamaioIndex.core.logging.Logger;
import kodlamaioIndex.core.logging.MailLogger;
import kodlamaioIndex.dataAccess.HibernateCourseDao;
import kodlamaioIndex.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 =  new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",1,"Engin Demiroğ",0);
		Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",2,"Engin Demiroğ",0);
		Course course3 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)",3,"Engin Demiroğ",0);
		Course course4 = new Course("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",4,"Engin Demiroğ",0);
		Course course5 = new Course("Programlamaya Giriş için Temel Kurs",5,"Engin Demiroğ",0);
		
		Logger[]loggers= {new DataBaseLogger(), new FileLogger(), new MailLogger()};
		CourseManager courseManager = new CourseManager(CourseDao courseDao, loggers, Course[]course);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);
		
	}

}


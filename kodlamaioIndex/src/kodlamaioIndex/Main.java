package kodlamaioIndex;

import kodlamaioIndex.business.CategoryManager;
import kodlamaioIndex.business.CourseManager;
import kodlamaioIndex.business.InstructorManager;
import kodlamaioIndex.core.logging.DataBaseLogger;
import kodlamaioIndex.core.logging.FileLogger;
import kodlamaioIndex.core.logging.Logger;
import kodlamaioIndex.core.logging.MailLogger;
import kodlamaioIndex.dataAccess.HibernateCategoryDao;
import kodlamaioIndex.dataAccess.HibernateCourseDao;
import kodlamaioIndex.dataAccess.HibernateInstructorDao;
import kodlamaioIndex.entities.Category;
import kodlamaioIndex.entities.Course;
import kodlamaioIndex.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 =  new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",1,"Engin Demiroğ",0);
		Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",2,"Engin Demiroğ",0);
		Course course3 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)",3,"Engin Demiroğ",10);
		Course course4 = new Course("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",4,"Engin Demiroğ",0);
		Course course5 = new Course("Programlamaya Giriş için Temel Kurs",5,"Engin Demiroğ",0);
		Category category1= new Category("Programlama");
		Category category2= new Category("Tümü");
		Instructor instructor1= new Instructor("Engin","Demiroğ",1);
		Logger[]loggers= {new DataBaseLogger(), new FileLogger(), new MailLogger()};
		Course [] courses = {course1, course2, course3, course4, course5};
		Category[]categories = {category1, category2};
		CourseManager courseManager= new CourseManager(new HibernateCourseDao(), loggers,courses);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);
		CategoryManager categoryManager= new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category1);
		InstructorManager instructorManager= new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		
		
	}

}


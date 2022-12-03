package kodlamaioIndex.business;

import kodlamaioIndex.core.logging.Logger;
import kodlamaioIndex.dataAccess.InstructorDao;
import kodlamaioIndex.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;

	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.get_firstName() + " " + instructor.get_lastName());

		}
	}
}

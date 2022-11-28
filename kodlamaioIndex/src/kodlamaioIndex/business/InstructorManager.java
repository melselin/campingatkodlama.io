package kodlamaioIndex.business;

import kodlamaioIndex.core.logging.Logger;
import kodlamaioIndex.dataAccess.InstructorDao;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	
}

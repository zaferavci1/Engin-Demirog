package Business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;
import entities.Educator;
import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	private CourseDao _course;
	private Educator _educator;
	private Logger[] _loggers;
	private Course[] _courses;
	
	public CourseManager(CourseDao courseDao, Educator educator, Logger[] loggers, Course[] courses) {
		_course = courseDao;
		_educator = educator;
		_loggers =  loggers;
		_courses = courses;
	}
	
	public void add(Course course) throws Exception {
		for (Course courseFor : _courses) {
			if (isAvailable(course)) {
				throw new Exception("Kursun ismi ayni olamaz");
			}
		}
		_course.add(course,_educator);
		for (Logger logger : _loggers) {
			logger.log(null);
		}
	}
}

package dataAccess;

import entities.Course;
import entities.Educator;

public interface CourseDao{
	void add(Course course, Educator educator);
}

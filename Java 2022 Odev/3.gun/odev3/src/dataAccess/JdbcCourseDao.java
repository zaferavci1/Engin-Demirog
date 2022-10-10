package dataAccess;

import entities.Course;
import entities.Educator;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course, Educator educator) {
		System.out.println(educator.getFirstName()+" kursu "+course.getCourseName()+ " jdbc ile eklendi");
	}
}

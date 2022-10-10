import Business.CategoryManager;
import Business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDal;
import dataAccess.HibernateCourseDal;
import entities.Category;
import entities.Course;
import entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Course course1 = new Course(1, "Java", 12);
		Course course2 = new Course(1, "Jva", 12);
		
		Course[] courses = {
				course1
		};
		
		Educator educator1 = new Educator(1, "Engin Demirog", "Demirog");

		Category category1 = new Category(1, "Proglamlama");
		Category category2 = new Category(1, "Proglmlama");

		Category[] categories = {
				category2
		};

		Logger[] loggers = { new DatabaseLogger(), new MailLogger() };

		CourseManager courseManager = new CourseManager(new HibernateCourseDal(), educator1, loggers,courses);
		courseManager.add(course2);

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDal(), categories);
		categoryManager.add(category1);

	}

}

package dataAccess;

import entities.Category;

public class HibernateCategoryDal implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + "kategory eklendi");
	}

}

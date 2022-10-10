package Business;

import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao _categoryDao;
	private Category[] _categorys;

	public CategoryManager(CategoryDao _category,Category[] categorys) {
		this._categoryDao = _category;
		_categorys= categorys;
	}
	
	public void add(Category category) throws Exception {
		for (Category categoryFor : _categorys) {
			if (category.getCategoryName() == categoryFor.getCategoryName()) {
				throw new Exception("Kursun ismi tekrar edemez");
			}
		}
		_categoryDao.add(category);
	}
	
	
}

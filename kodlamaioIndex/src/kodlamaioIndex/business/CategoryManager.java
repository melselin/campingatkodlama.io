package kodlamaioIndex.business;

import kodlamaioIndex.core.logging.Logger;
import kodlamaioIndex.dataAccess.CategoryDao;
import kodlamaioIndex.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[]categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories=categories;
	}

	public void add(Category category) throws Exception {

		for (Category newCategory : categories) {
			if (category.get_categoryType() == newCategory.get_categoryType()) {
				throw new Exception("This category already exists. Please try again.");

			}
			categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.log(category.get_categoryType());
			}

		}

	}

}

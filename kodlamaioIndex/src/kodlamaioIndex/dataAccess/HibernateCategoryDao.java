package kodlamaioIndex.dataAccess;

import kodlamaioIndex.entities.Category;


public class HibernateCategoryDao implements CategoryDao{
	@Override
	public void add(Category category) {
		System.out.println(category.get_categoryType()+ " has been successfully added via Hibernate.");
		
	}

}

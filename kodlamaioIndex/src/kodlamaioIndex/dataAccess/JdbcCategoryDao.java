package kodlamaioIndex.dataAccess;

import kodlamaioIndex.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	@Override
	public void add(Category category) {
		System.out.println(category+ " has been successfully added via jdbc");
	}
	

}

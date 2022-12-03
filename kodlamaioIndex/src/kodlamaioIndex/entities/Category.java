package kodlamaioIndex.entities;

public class Category {
	String _categoryType;

	public Category() {
		super();
	}

	public Category(String categoryType) {
		this._categoryType = categoryType;
	}

	public String get_categoryType() {
		return _categoryType;
	}

	void set_categoryType(String categoryType) {
		this._categoryType = categoryType;
	}

}

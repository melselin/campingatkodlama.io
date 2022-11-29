package kodlamaioIndex.entities;

public class Course {
	String _courseName;
	int _courseId;
	String _instructor;
	double _coursePrice;
	public Course() {
		super();
	}
	public Course(String courseName, int courseId, String instructor, double coursePrice) {
		this._courseName = courseName;
		this._courseId = courseId;
		this._instructor = instructor;
		this._coursePrice = coursePrice;
	}
	public String get_courseName() {
		return _courseName;
	}
	void set_courseName(String courseName) {
		this._courseName = courseName;
	}
	public int get_courseId() {
		return _courseId;
	}
	void set_courseId(int courseId) {
		this._courseId = courseId;
	}
	public String get_instructor() {
		return _instructor;
	}
	void set_instructor(String instructor) {
		this._instructor = instructor;
	}
	public double get_coursePrice() {
		return _coursePrice;
	}
	void set_coursePrice(double coursePrice) {
		this._coursePrice = coursePrice;
	}
	
}

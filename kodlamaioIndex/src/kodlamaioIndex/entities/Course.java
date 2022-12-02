package kodlamaioIndex.entities;

public class Course {
	Instructor instructor= new Instructor();
	String _courseInstructor= instructor.get_fullName();
	String _courseName;
	int _courseId;
	double _coursePrice;

	


	public Course( String _courseName, int _courseId, double _coursePrice) {
		super();
		this._courseName = _courseName;
		this._courseId = _courseId;
		this._coursePrice = _coursePrice;
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
		return _courseInstructor;
	}

	void set_instructor(String instructor) {
		this._courseInstructor=instructor;
	}

	public double get_coursePrice() {
		return _coursePrice;
	}

	void set_coursePrice(double coursePrice) {
		this._coursePrice = coursePrice;
	}

}

package kodlamaioIndex.entities;

public class Instructor {
	String _instructorName;
	int _instructorId;
	public Instructor() {
		super();
	}
	public Instructor(String instructorName, int instructorId) {
		super();
		this._instructorName = instructorName;
		this._instructorId = instructorId;
	}
	public String get_instructorName() {
		return _instructorName;
	}
	void set_instructorName(String instructorName) {
		this._instructorName = instructorName;
	}
	public int get_instructorId() {
		return _instructorId;
	}
	void set_instructorId(int instructorId) {
		this._instructorId = instructorId;
	}
	

}

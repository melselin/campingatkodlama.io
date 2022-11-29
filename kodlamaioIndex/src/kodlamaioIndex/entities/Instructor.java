package kodlamaioIndex.entities;

public class Instructor {
	String _firstName;
	String _lastName;
	String _fullName=_firstName+" "+_lastName;
	int _instructorId;

	public Instructor() {
		super();
	}

	public Instructor(String _firstName, String _lastName, int _instructorId) {
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._instructorId = _instructorId;
	}

	public String get_firstName() {
		return _firstName;
	}

	void set_firstName(String firstName) {
		this._firstName = firstName;
	}
	

	public String get_fullName() {
		return _fullName;
	}

	void set_fullName(String fullName) {
		this._fullName = fullName;
	}

	public int get_instructorId() {
		return _instructorId;
	}

	void set_instructorId(int instructorId) {
		this._instructorId = instructorId;
	}

	public String get_lastName() {
		return _lastName;
	}

	void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}
	
	

}

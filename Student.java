package sample;

public class Student extends Human {

	private long id;
	private String groupName;

	public Student() {
	};

	public Student(String name, String secondName, int age, Sex sex, long id, String groupName) {
		super(name, secondName, age, sex);
		this.id = id;
		this.groupName = groupName;
	}

	public long getId() {
		return id;
	}

	protected String getGroupName() {
		return groupName;
	}

	protected void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	protected void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		String info = super.toString() + "Student [zachetNumber=" + id + ", groupName=" + groupName + "]\n";
		return info;

	}

}

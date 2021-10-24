package sample;

public class Human {

	protected String name;
	protected String secondName;
	protected int age;
	protected Sex sex;

	public Human(String name, String secondName, int age, Sex sex) {
		this.name = name;
		this.secondName = secondName;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
	};

	protected String getSecondName() {
		return secondName;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected Sex getSex() {
		return sex;
	}

	protected void setSex(Sex sex) {
		this.sex = sex;
	}

	protected void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", secondName=" + secondName + ", age=" + age + ", sex=" + sex + "]";
	}

}

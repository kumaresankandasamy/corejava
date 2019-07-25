
public class User {
	protected int id;
	private String name;
	private int age;
	private String location;
	public User(int id, String name, int age, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}

}

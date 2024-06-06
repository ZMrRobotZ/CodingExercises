package lezioni;
import Artifact;


public class User {
	
	String name;
	int age;
	int height;
	
	public User(String name, int age, int height) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	public User(int age, String name, int height) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	public User(int height, int age, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	public User(String name, int height, int age) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Artifact vaso = new Artifact(2121121);
        User uno = new User("A", 2222, 5);
        User u2 = new User(2222, 3, "a");
        User u3 = new User(3, 2222, "a");
        User u4 = new User(3, "a", 2222);
        User u5 = new User("a", 3, 2222);
        System.out.print(vaso);
    }
}

package accessSpecifier;

public class Person {
	private String name;
	Person(String name) {
		this.name=name;
	}
	private void details() {
		System.out.println("the name is "+name);
	}

}

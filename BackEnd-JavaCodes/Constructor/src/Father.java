
public class Father {
	String name;
	int age;
	
	Father(){
		System.out.println("A");
	}
	Father(String name, int age){
		this();
		System.out.println("B");
	}
}

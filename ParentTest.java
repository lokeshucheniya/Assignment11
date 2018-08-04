
public class Parent1 {
	String p1 = "This is an example ";
}

public interface Parent2 {
	String p2 = "of interface and inheritance "; 
}

public class Child extends Parent1 implements Parent2{
	void add() {
		System.out.println(p1+""+p2);
	}
}

public class ParentTest {
	public static void main(String args[]) {
		Child child = new Child();
		child.add();
	
	}
}

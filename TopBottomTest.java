
//Abstract Class Top1
abstract public class Top1 {
	abstract void disp1();
}

//Class Bottom1 inheriting class Top1
public class Bottom1 extends Top1{
	public void disp1() {
		System.out.println("This is child class");
	}
}

//Class Bottom2 inheriting Class Top1
public class Bottom2 extends Top1{
	public void disp1() {
		System.out.println("This is child class");
	}
}

//Class Bottom3 inheriting Class Top1
public class Bottom3 extends Top1 {
	public void disp1() {
		System.out.println("This is child class");
	}
}


public class TopBottomTest {
	
	static void test(Top1 t) {
		t.disp1();
	}
	
	public static void main(String args[]) {
		Bottom1 b1 = new Bottom1();
		test(b1);
		
		Bottom2 b2 = new Bottom2();
		test(b2);
		
		Bottom3 b3 = new Bottom3();
		test(b3);
		
	}
}

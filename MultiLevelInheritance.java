
class A {
	A(){
		System.out.println("This is class A");
	}
}
class B extends A {
	B() {
		System.out.println("This is class B");
	}
}
class C extends B {
	C() {
		System.out.println("This is class C");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		C c = new C();
	}
}
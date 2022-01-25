package package1;

class A {
	A() {
		
		System.out.println("A");
	}
	public void PrintClass() {
		System.out.println("PrintClass-A");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B");
	}
	public void PrintClass() {
		super.PrintClass();
		System.out.println("PrintClass-b");
	}
}

class C extends B {
	C() {
		
		System.out.println("c");
	}
	public void PrintClass() {
		super.PrintClass();
		System.out.println("PrintClass-c");
	}
}

public class InheritanceAccess {

	public static void main(String[] args) {
		C c=new C();
		c.PrintClass();
	}

}

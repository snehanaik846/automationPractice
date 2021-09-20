package package1;

class Animal {
	Animal() {
		System.out.println("Animal");
	}
	public void PrintClass() {
		System.out.println("PrintClass-Animals");
	}
}

class Apes extends Animal {
	Apes() {
		System.out.println("Apes");
	}
	public void PrintClass() {
		super.PrintClass();
		System.out.println("PrintClass-Apes");
	}
}

class Humans extends Apes {
	Humans() {
		System.out.println("Humans");
	}
	public void PrintClass() {
		super.PrintClass();
		System.out.println("PrintClass-Humans");
	}
}

public class InheritanceEg {

	public static void main(String[] args) {
		Humans h=new Humans();
		//h.PrintClass();
	}

}

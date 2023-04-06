package Package_1.page_2;

public class Ex7_2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
class Parent{ int x = 10;}
class Child {
	Parent parent = new Parent();
	int x = 20; 
	void method() {
		System.out.println("x = " + x);
		System.out.println("Parent.x = " + parent.x);
	}
}
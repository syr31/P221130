package p330_7_6;

class SuperTest2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 10;

}

class Child extends Parent {
	int x = 20;

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);				// 자기 자신
		System.out.println("super.x=" + super.x);			//부모클래스
	}
}
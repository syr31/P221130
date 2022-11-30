package p352_7_14;

final class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() {

	}

	private static Singleton getInstance() {
		if (s == null)
			s = new Singleton();
		return s;
	}
}

class SingletonTest {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
//		Singleton s2 = Singleton.getInstance();
	}

}

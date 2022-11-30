package p361_7_16;

class CastingTest2 {
	class Car {
		String color;
		int door;

		void drive() {
			System.out.println("drive, Brrrr~");
		}

		void stop() {
			System.out.println("stop!");
		}
	}

	class FireEngine extends Car {
		void water() {
			System.out.println("water!");

		}
	}

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine) car;
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}

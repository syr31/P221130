package p332_7_7;

class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
	}
}

class Point {
	int x, y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}		
		String getLocation() {
			return "x:" + x + ", y :" + y;
		}
	}

	class Point3D extends Point {
		int z;

		Point3D(int x, int y, int z) {
			super(x,y);	// 자기 자신 멤버변수는 자기 자신 클래스에서 처리해주는 게 좋다. (부모 클래스의 int x ,y 를 자식 클래스 point3d에서 super(x,y); 로 처리해준다)
//			this.x = x;
//			this.y = y;
			this.z = z;

		}

		String getLocation() {
			return "x:" + x + ",y:" + y + ",z:" + z;
		}
	}

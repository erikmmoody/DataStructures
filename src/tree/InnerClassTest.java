package tree;

public class InnerClassTest {
	
	class InnerClass {
		private int x;
		private int y;
	}
	
	private InnerClass inclass;
	
	public void setData(int x, int y) {
		inclass = new InnerClass();
		inclass.x = x;
		inclass.y = y;
	}
	
	public int getX() {
		return inclass.x;
	}
	
	public int getY() {
		return inclass.y;
	}
	
	public static void main(String args[]) {
		InnerClassTest test = new InnerClassTest();
		test.setData(1, 2);
		System.out.println("data is: (" + test.getX() + ", " + test.getY() + ")");
	}

}



package demo;

public class Method1 {
	public int number(int a, int b) {
	     int c = a*b;
	     return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1 b = new Method1();
		int d = b.number(10, 5);
		System.out.println("number:" +d);

	}

}

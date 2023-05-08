package demo;

public class Constructor {
	private String name;
	private Constructor() {
		System.out.println("constructor invoked");
		name = "Sulagna";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor a = new Constructor();
		System.out.println("name: " +a.name);
		

	}

}

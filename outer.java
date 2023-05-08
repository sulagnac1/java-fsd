package demo;

public class outer{
	void outer_method() {
		System.out.println("inside outer method");
	    class Inner {
	    	void inner_method()
	    	{
	    		System.out.println("inside inner");
	    		}
	    	}
	    Inner a = new Inner();
	    a.inner_method();
	    	
	    }
	public static void main(String[] args)
	{
		outer b = new outer();
		b.outer_method();
	}
}


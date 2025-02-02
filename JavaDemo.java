package test;

public class JavaDemo {

	public void DemoFunc(Integer i) {
		System.out.println("Integer");
	}
	
	public void DemoFunc(String s) {
		System.out.println("String");
	}
	
	
	public static void main(String[] args) {

		
		JavaDemo d= new JavaDemo();
		
		d.DemoFunc("null");
	}

}

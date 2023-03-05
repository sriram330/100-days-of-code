
public class SampleClass {
	
	String name = "Tommy";
	
	//static variable
	static int age = 25;
	
	public void getName() {
		System.out.println("The name is " + name);
	}
	
	public static void getAge() {
		System.out.println(age);
	}
			

	public static void main(String[] args) {

		
		// how to call static methods. // 1. direct calling 		//2. calling by classname 
		
		getAge();
		SampleClass.getAge();
		
	// non static method - methods need to be called by object reference
		
		SampleClass obj1 = new SampleClass();
		obj1.getName();
	
	// can i access static methods by using object reference - Yes. but not good practice.
		
		obj1.getAge();

	}

}

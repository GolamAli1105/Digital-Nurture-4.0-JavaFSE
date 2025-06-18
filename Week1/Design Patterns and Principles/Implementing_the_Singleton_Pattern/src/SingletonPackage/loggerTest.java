package SingletonPackage;

public class loggerTest {
	public static void main (String args[]) {
		Logger test1 = Logger.getInstance();
		Logger test2 = Logger.getInstance();
		System.out.println("Hashcode of test1: " + test1.hashCode());
		System.out.println("Hashcode of test2: " + test2.hashCode());
		if(test1==test2) 
			System.out.println("Both objects point to the same memory location. Singleton design pattern is achieved");
		else
			System.out.println("Both objects point to different memory locations. Singleton design pattern is not achieved");
	}
}

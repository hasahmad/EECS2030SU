package eecs2030.practice1;

public class SingleClass1 {
	
	private static SingleClass1 INSTANCE = new SingleClass1();
	
	private SingleClass1() {
		
	}
	
	public static SingleClass1 getInstance() {
		if(SingleClass1.INSTANCE == null) {
			SingleClass1.INSTANCE = new SingleClass1();
		}
		
		return SingleClass1.INSTANCE;
	}
}

package eecs2030.practice1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TabTestSpec1 {

	@Test
	public void test01() {
		LabTestClass1 labTest1 = new LabTestClass1(); 
		assertNotNull(labTest1);
	}
	
	@Test
	public void test02() {
		LabTestClass1.HelperClass1 labTest1 = new LabTestClass1.HelperClass1(); 
		assertNotNull(labTest1);
	}

	@Test
	public void test07() {
		LabTestClass3 labTest1 = new LabTestClass2(); 
		assertNotNull(labTest1);
	}
	
	@Test
	public void test08() {
		LabTestClass3 labTest1 = new LabTestClass1(); 
		assertNotNull(labTest1);
	}
	
	@Test
	public void test09() {

		int startCount = MultiClass1.getCallCount();
		
		MultiClass1 labTest1 = MultiClass1.getInstance(1); 
		assertNotNull(labTest1);
		
		MultiClass1 labTest2 = MultiClass1.getInstance(2); 
		assertNotNull(labTest2);
		
		MultiClass1 labTest3 = MultiClass1.getInstance(3); 
		assertNotNull(labTest3);
		
		assertNotEquals(labTest1, labTest2);
		assertEquals(labTest1, labTest3);
		
		int endCount = MultiClass1.getCallCount();
		assertEquals(endCount - startCount, 3);
	}
	
	@Test
	public void test10() {
		// singleton class MultiClass1
		SingleClass1 labTest1 = SingleClass1.getInstance(); 
		assertNotNull(labTest1);
		SingleClass1 labTest2 = SingleClass1.getInstance(); 
		assertNotNull(labTest1);
		assertEquals(labTest1, labTest2);
	}

}

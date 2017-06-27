package eecs2030.practice1;

import java.util.Map;
import java.util.TreeMap;

public class MultiClass1 {
	private static Map<String, MultiClass1> INSTANCES = new TreeMap<String, MultiClass1>();
	private static int count;
	
	private MultiClass1(int num) {
//		MultiClass1.num = oddEven(num);
	}
	
	public static MultiClass1 getInstance(int num) {
		num = oddEven(num);
		String key = "" + num;
		MultiClass1 n = MultiClass1.INSTANCES.get(key);
		if(n==null) {
			n = new MultiClass1(num);
			n.INSTANCES.put(key, n);
		}
		MultiClass1.count++;
		return n;
	}
	
	public static int getCallCount() {
		return MultiClass1.count;
	}
	
	public static int oddEven(int num) {
		if(num % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}

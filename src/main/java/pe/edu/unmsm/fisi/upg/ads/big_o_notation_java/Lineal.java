package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.Arrays;
import java.util.List;

//Complexity: O(N)
public class Lineal {
	private final static int N = 90;
	
	public Lineal() {
	}
	
	public static void main(String[] args) {
		int NEEDLE = 64;
		Lineal lineal = new Lineal();
		LinealExampleType linealExampleType = LinealExampleType.Loop;
		switch (linealExampleType) {
			case Loop: lineal.loop(N); break;
			case Search: lineal.search(NEEDLE); break;
			case Factorial: lineal.printFactorial(N); break;
		}
	}
		
    public void loop(int N) {
    	int counter = 0;
        System.out.println("**********************loop**********************");
        while (counter < N) {
            System.out.println(counter);
            counter = counter + 1;
        }
    }
    
    public void search(int needle) {
    	List<Integer> valueList = Arrays.asList(2, 4, 4, 5, 7, 10, 23, 25, 64);
		boolean found = this.containsNeedle(needle, valueList);
		System.out.println("**********************search**********************");
		System.out.println(found);
    }
    
    public boolean containsNeedle(int needle, List<Integer> valueList) {
        for (long value : valueList) {
            if (value == needle) {
                return true;
            }
        }
        return false;
    }
    
    public void printFactorial(int N) {
    	long factorial = this.getFactorial(N);
    	System.out.println("**********************factorial**********************");
    	System.out.println(factorial);
    }
    
    public long getFactorial(int N) {
        if (N == 1) {
            return 1;
        }
        if (N > 20) { throw new IllegalArgumentException(N + " is out of range"); }
        return (N * getFactorial(N - 1));
    }
}

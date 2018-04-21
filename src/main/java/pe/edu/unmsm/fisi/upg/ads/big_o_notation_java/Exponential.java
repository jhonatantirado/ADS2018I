package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

//Complexity: O(2^N)
public class Exponential {

	public static void main(String[] args) {
		long N = 80;
		Exponential exponential = new Exponential();
		Stopwatch stopwatch = Stopwatch.createStarted();
		for (int i = 1; i <= N; i++) {
			try {
				long fibonacci = exponential.fibonacciprogdinamica(i);
				System.out.println(i + " => " + fibonacci);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
		System.out.println(String.format("Time elapsed: %d MILIseconds", stopwatch.elapsed(TimeUnit.MILLISECONDS)) + "\n");
	}
	
	public long fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("N can not be less than zero");
        }
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
	
	public long fibonacciprogdinamica (int n) throws Exception {
		//almacenar los valores calculados en cache
		
        if (n < 0) {
            throw new Exception("N can not be less than zero");
        }
        if (n <= 2) {
            return 1;
        }
        
		int[] res = new int[n+1];
		res[0] = 0;
		res[1] = 1;
		for (int k = 2; k <= n; k++)
		{
			res[n] = res[n-2] + res[n-1];
		}
		return res[(int) n];
		
    }
	
	public long fibonaccilineal(int n) throws Exception {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int k = 0; k < n; k++)
		{
				c = a + b;
				a = b;
				b = c;	
		}
		return a;
    }
}

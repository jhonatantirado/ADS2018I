package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

//Complexity: O(2^N)
public class Exponential {

	private static long N = 30;
	private static long f[] = new long [(int) N + 1];
	
	public static void main(String[] args) {
		
		Exponential exponential = new Exponential();
		Stopwatch stopwatch = Stopwatch.createStarted();
		for (int i = 1; i <= N; i++) {
			try {
				long fibonacci = exponential.TopDownFibonnaci(i);
				System.out.println(i + " => " + fibonacci);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(
				String.format("Time elapsed: %d MICROSECONDS", stopwatch.elapsed(TimeUnit.MICROSECONDS)) + "\n");
	}

	//Complejidad Exponencial O(2^N)
	public long fibonacci(int n) throws Exception {
		if (n < 0) {
			throw new Exception("N can not be less than zero");
		}
		if (n <= 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	//Complejidad Lineal O(N)
	public long fibonaccilineal(int n) throws Exception {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int k = 0; k < n; k++) {
			c = a + b;
			a = b;
			b = c;
		}
		return a;
	}
	
	//Complejidad Logarítmica O(log N base 2)
	//Programación Dinámica
	//Bottom-up Fibonacci: Resolver y almacenar el resultado de todos los subproblemas, del más simple al más complejo
	public long fibonacciprogdinamica(int n) throws Exception {
		if (n < 0) {
			throw new Exception("N can not be less than zero");
		}
		if (n <= 1) {
			return n;
		}

		long[] res = new long[n + 1];

		res[0] = 0;
		res[1] = 1;

		for (int k = 2; k <= n; k++) {
			res[k] = res[(k - 2)] + res[(k - 1)];
		}
		return res[n];
	}
	
	//Complejidad Logarítmica O(log N base 2)
	//Programación Dinámica
	//TopDown Fibonnaci: Almacenar cada subproblema resuelto para reutilizarlo la próxima vez que sea requerido
	//https://introcs.cs.princeton.edu/java/23recursion/
	public long TopDownFibonnaci(int n) throws Exception
	{
		if (n < 0) {
			throw new Exception("N can not be less than zero");
		}
		if (n <= 1) {
			return n;
		}
		f[0]=0;
		f[1]=1;
		if (f[n]>0) return f[n];
		f[n]=f[n-1] + f[n-2];
		return f[n];
	}
	
}
